/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.votingsystem.bussiness.custom.CandidateBO;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.entity.Candidate;
import lk.ijse.votingsystem.repository.RepositoryFactory;
import lk.ijse.votingsystem.repository.custom.CandidateRepository;
import lk.ijse.votingsystem.resources.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class CandidateBOImpl implements CandidateBO{
    private CandidateRepository candidateRepository;

    public CandidateBOImpl() {
        candidateRepository=(CandidateRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CANDIDATE);
        
    }
    
    
    @Override
    public boolean addCandidate(CandidateDTO candidateDTO) throws Exception {
          try(Session session=HibernateUtil.getSessionFactory().openSession()){
              candidateRepository.setSession(session);
              session.beginTransaction();
              
              Candidate c=new Candidate(candidateDTO.getcId(),candidateDTO.getIndexNo(),candidateDTO.getName(),candidateDTO.getNic(),candidateDTO.getTpNo(),candidateDTO.getEmail(),candidateDTO.getAddress(),candidateDTO.getPassword(),candidateDTO.getPost(),candidateDTO.getImage(),candidateDTO.getFileName()
              );
              boolean result=candidateRepository.save(c);
              session.getTransaction().commit();
              return result;
          }
        
    }

    @Override
    public boolean updateCandidate(CandidateDTO candidateDTO) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            candidateRepository.setSession(session);
            session.beginTransaction();
            Candidate c=new Candidate(candidateDTO.getcId(),candidateDTO.getIndexNo(),candidateDTO.getName(),candidateDTO.getNic(),candidateDTO.getTpNo(),candidateDTO.getEmail(),candidateDTO.getAddress(),candidateDTO.getPassword(),candidateDTO.getPost(),candidateDTO.getImage(),candidateDTO.getDesignationDetail(),candidateDTO.getServiceDetail(),candidateDTO.getVisionDetail(),candidateDTO.getOtherDetail());
            candidateRepository.update(c);
            session.getTransaction().commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteCandidate(String indexNo) throws Exception {

        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            candidateRepository.setSession(session);
            session.beginTransaction();
            Candidate candidate=candidateRepository.findById(indexNo);
            boolean result=false;
            if(candidate !=null){
                candidateRepository.delete(candidate);
            }
            session.getTransaction().commit();
            return result;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CandidateDTO> getAllCandidate() throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            candidateRepository.setSession(session);
            session.beginTransaction();
            List<Candidate> candidates=candidateRepository.findAll();
            session.getTransaction().commit();
            if(candidates!=null){
                List<CandidateDTO> allCandidate=new ArrayList<>();
                for (Candidate candidate : candidates) {
                    System.out.println("BOCid"+candidate.getcId());
                    System.out.println("BOName"+candidate.getFileName());
                    CandidateDTO dto=new CandidateDTO(candidate.getcId(),candidate.getIndexNo(),candidate.getName(),candidate.getNic(),candidate.getTpNo(),candidate.getEmail(),candidate.getAddress(),candidate.getPassword(),candidate.getPost(),candidate.getImage(),candidate.getFileName());
                    allCandidate.add(dto);
                }
              
                return allCandidate;
            }else{
                return null;
            }
        }
    }



    @Override
    public CandidateDTO findCandidate(String index) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            candidateRepository.setSession(session);
            session.beginTransaction();
            Candidate candidate=candidateRepository.findById(index);
            if(candidate!=null){
                CandidateDTO dto=new CandidateDTO(candidate.getcId(),candidate.getIndexNo(),candidate.getName(),candidate.getNic(),candidate.getTpNo(),candidate.getEmail(),candidate.getAddress(),candidate.getPassword(),candidate.getPost(),candidate.getImage(),candidate.getDesignationDetail(),candidate.getServiceDetail(),candidate.getVisionDetail(),candidate.getOtherDetail(),candidate.getFileName());
                return dto;
            }else{
                return null;
            }
        }
    }

    @Override
    public List<CandidateDTO> getSecretary() throws Exception {
         try(Session session=HibernateUtil.getSessionFactory().openSession()){
            candidateRepository.setSession1(session);
            session.beginTransaction();
            List<Candidate> candidates=candidateRepository.findSecreatary();
            session.getTransaction().commit();
            if(candidates!=null){
                List<CandidateDTO> allCandidate=new ArrayList<>();
                
                for (Candidate candidate : candidates) {
                    
                    CandidateDTO dto=new CandidateDTO(candidate.getcId(),candidate.getPost());
                    allCandidate.add(dto);
                    
                }
              
                return allCandidate;
            }else{
                return null;
            }
        }
    }
    
}
