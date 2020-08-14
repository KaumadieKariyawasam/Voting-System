 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.votingsystem.bussiness.custom.CommissionBO;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.dto.CommissionDTO;
import lk.ijse.votingsystem.entity.Candidate;
import lk.ijse.votingsystem.entity.Commission;
import lk.ijse.votingsystem.repository.RepositoryFactory;
import lk.ijse.votingsystem.repository.custom.CommissionerRepository;
import lk.ijse.votingsystem.resources.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class CommissionBOImpl implements CommissionBO{
    private CommissionerRepository commissionerRepository;
    
    public CommissionBOImpl(){
        commissionerRepository=(CommissionerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.COMMISSION);
    }

    @Override
    public boolean addCommissioner(CommissionDTO commissionDTO) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
              commissionerRepository.setSession(session);
              session.beginTransaction();
              Commission c=new Commission(commissionDTO.getCmId(),commissionDTO.getName(),commissionDTO.getNic(),commissionDTO.getTpNo(),commissionDTO.getAddress(),commissionDTO.getUserName(),commissionDTO.getPassword());
              
              boolean result=commissionerRepository.save(c);
              session.getTransaction().commit();
              return result;
          }
    }

    @Override
    public boolean updateCommission(CommissionDTO commissionDTO) throws Exception {
         try(Session session=HibernateUtil.getSessionFactory().openSession()){
            commissionerRepository.setSession(session);
            session.beginTransaction();
            Commission c=new Commission(commissionDTO.getCmId(),commissionDTO.getName(),commissionDTO.getNic(),commissionDTO.getTpNo(),commissionDTO.getAddress(),commissionDTO.getUserName(),commissionDTO.getPassword());
            commissionerRepository.update(c);
            session.getTransaction().commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteCommissioner(String cmId) throws Exception {
         try(Session session=HibernateUtil.getSessionFactory().openSession()){
            commissionerRepository.setSession(session);
            session.beginTransaction();
            Commission commission=commissionerRepository.findById(cmId);
            boolean result=false;
            if(commission !=null){
                commissionerRepository.delete(commission);
            }
            session.getTransaction().commit();
            return result;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CommissionDTO> getAllCommissioners() throws Exception {
        System.out.println("BO running");
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            commissionerRepository.setSession(session);
            session.beginTransaction();
            List<Commission> commissions=commissionerRepository.findAll();
          
            session.getTransaction().commit();
            if(commissions!=null){
                List<CommissionDTO> allCommissioner=new ArrayList<>();
                System.out.println("all"+allCommissioner);
                for (Commission commission : commissions) {
                    CommissionDTO commissionDTO=new CommissionDTO(commission.getCmId(),commission.getName(),commission.getNic(),commission.getAddress(),commission.getTpNo(),commission.getUserName(),commission.getPassword());
                    allCommissioner.add(commissionDTO);
                }
                return allCommissioner;
            }else{
                return null;
            }
        }
    }

    @Override
    public CommissionDTO findCommissioner(String cmId) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            commissionerRepository.setSession(session);
            session.beginTransaction();
            Commission c=commissionerRepository.findById(cmId);
            if(c!=null){
                CommissionDTO dto=new CommissionDTO(c.getCmId(),c.getName(),c.getNic(),c.getTpNo(),c.getAddress(),c.getUserName(),c.getPassword());
                return dto;
                
            }else{
                return null;
            }
        }
    }
    
}
