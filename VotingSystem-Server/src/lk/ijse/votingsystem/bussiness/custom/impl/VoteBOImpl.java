/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.votingsystem.bussiness.custom.VoteBO;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.dto.ResulltDTO;
import lk.ijse.votingsystem.dto.VoteDTO;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.dto.VotesDTO;
import lk.ijse.votingsystem.entity.Candidate;
import lk.ijse.votingsystem.entity.Vote;
import lk.ijse.votingsystem.entity.Vote_PK;
import lk.ijse.votingsystem.entity.Voter;
import lk.ijse.votingsystem.repository.RepositoryFactory;
import lk.ijse.votingsystem.repository.custom.VoteRepository;
import lk.ijse.votingsystem.resources.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class VoteBOImpl implements VoteBO {

    private VoteRepository voteRepository;

    public VoteBOImpl() {
        this.voteRepository = (VoteRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.VOTE);
    }

    @Override
    public boolean addVote(VoteDTO voteDTO) throws Exception {

        return false;
    }

    @Override
    public boolean addVotes(List<VoteDTO> list) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            session.beginTransaction();

            voteRepository.setSession(session);

            boolean isAdded1 = false;
            
            
            
            
            VoterDTO voterDto = null;
            CandidateDTO candicate = null;
            for (VoteDTO voteDTO : list) {
                voterDto = voteDTO.getVoter();
                candicate = voteDTO.getCandidate();
                Voter voterentity = new Voter();
                voterentity.setIndexNo(voterDto.getIndexNo());
                Candidate can = new Candidate();
                can.setcId(candicate.getcId());
                Vote_PK vote = new Vote_PK();
                vote.setIndexNo(voterDto.getIndexNo());
                vote.setcId(candicate.getcId());
               
                Vote voteE = new Vote();
                voteE.setCandidate(can);
                voteE.setVoter(voterentity);
                voteE.setVote_Pk(vote);
                
                isAdded1 = voteRepository.save(voteE);
            }
            if (isAdded1) {
                session.getTransaction().commit();
                return true;
            } else {
                session.getTransaction().rollback();
                return false;
            }

        }
    }

    @Override
    public boolean addVotess(VotesDTO d) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            session.beginTransaction();

            voteRepository.setSession(session);

            boolean isAdded1 = false;
            VoterDTO voterDto = d.getVoter();
            CandidateDTO candicate = null;
            List<VoteDTO> list = d.getList();
            Voter voterentity = new Voter();
            voterentity.setIndexNo(voterDto.getIndexNo());
            voterentity.setContact(voterDto.getContact());
            voterentity.setAddress(voterDto.getAddress());
            voterentity.setName(voterDto.getName());
            voterentity.setPassword(voterDto.getPassword());
            voterentity.setTpNo(voterDto.getTpNo());
            
            for (VoteDTO voteDTO : list) {

                candicate = voteDTO.getCandidate();
                Candidate can = new Candidate();
                can.setcId(candicate.getcId());
                can.setAddress(candicate.getAddress());
                can.setDesignationDetail(candicate.getDesignationDetail());
                can.setEmail(candicate.getEmail());
                can.setFileName(candicate.getFileName());
                can.setIndexNo(candicate.getIndexNo());
                can.setPost(candicate.getPost());
                can.setPassword(candicate.getPassword());
                can.setName(candicate.getName());
                can.setNic(candicate.getNic());
                Vote_PK vote = new Vote_PK();
                vote.setIndexNo(voterDto.getIndexNo());
                vote.setcId(candicate.getcId());
               
                Vote voteE = new Vote();
                voteE.setCandidate(can);
                voteE.setVoter(voterentity);
                voteE.setVote_Pk(vote);
                voteE.seteId(d.geteId());
                System.out.println("rrrrrrrrrrrrr" + voteE);
                isAdded1 = voteRepository.save(voteE);

            }


            if (isAdded1) {
                session.getTransaction().commit();
                return true;
            } else {
                session.getTransaction().rollback();
                return false;
            }

        }
    }

    @Override
    public List<VoteDTO> getVoteIndex() throws Exception {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            voterrRepository.setSession(session);
//            session.beginTransaction();
//            List<Voter> voters = voterrRepository.findAll();
//            session.getTransaction().commit();
//            if (voters != null) {
//                List<VoterDTO> allVoters = new ArrayList<>();
//                for (Voter voter : voters) {
//                    VoterDTO dto = new VoterDTO(voter.getIndexNo(), voter.getName(), voter.getTpNo(), voter.getContact(), voter.getAddress());
//                    allVoters.add(dto);
//                }
//
//                return allVoters;
//            } else {
//                return null;
//            }
//        }
          try(Session session=HibernateUtil.getSessionFactory().openSession()){
              voteRepository.setSession1(session);
              session.beginTransaction();
              List<Vote> vote=voteRepository.getIndex();
              session.getTransaction().commit();
               if(vote!=null){
                 List<VoteDTO> getIndex=new ArrayList<>();
                   for (Vote vote1 : vote) {
                       VoteDTO dto=new VoteDTO();
                       String index=vote1.getCandidate().getIndexNo();
                       dto.setCandidate(index);
                       dto.seteId(vote1.geteId());
                   }
                   return getIndex;
               }else{
                   return null;
               }
          }
    }

    @Override
    public List<ResulltDTO> getPresidentResults() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            
            voteRepository.setSession1(session);
            session.beginTransaction();
            
            List<Object[]> list = voteRepository.getPresidentVote();
            System.out.println("BOList"+list);
            session.getTransaction().commit();
            List<ResulltDTO> presidentResult = new ArrayList<>();
            if (list != null) {
                for (Object[] objects : list) {
                    ResulltDTO dto = new ResulltDTO();
                   dto.setCanNo((String) objects[0]);
                    
                 dto.setTotVote((BigInteger) objects[1]);
                    dto.setCanName((String) objects[2]);
                    presidentResult.add(dto);

                }
                return presidentResult;
            } else {
                return null;
            }

        }

    }

    @Override
    public List<ResulltDTO> getSecretaryResults() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            voteRepository.setSession1(session);
            session.beginTransaction();

            List<Object[]> list = voteRepository.getMembers();
            System.out.println("BOList"+list);
            session.getTransaction().commit();
            List<ResulltDTO> presidentResult = new ArrayList<>();
            if (list != null) {
                for (Object[] objects : list) {
                    ResulltDTO dto = new ResulltDTO();
                   dto.setCanNo((String) objects[0]);
                    
                 dto.setTotVote((BigInteger) objects[1]);
                    dto.setCanName((String) objects[2]);
                    presidentResult.add(dto);

                }
                return presidentResult;
            } else {
                return null;
            }

        }

    }

    @Override
    public List<ResulltDTO> getMembers() throws Exception {
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            voteRepository.setSession1(session);
            session.beginTransaction();

            List<Object[]> list = voteRepository.getSecretaaryVote();
            System.out.println("BOList"+list);
            session.getTransaction().commit();
            List<ResulltDTO> presidentResult = new ArrayList<>();
            if (list != null) {
                for (Object[] objects : list) {
                    ResulltDTO dto = new ResulltDTO();
                   dto.setCanNo((String) objects[0]);
                    
                 dto.setTotVote((BigInteger) objects[1]);
                    dto.setCanName((String) objects[2]);
                    presidentResult.add(dto);

                }
                return presidentResult;
            } else {
                return null;
            }

        }
        
    }

}
