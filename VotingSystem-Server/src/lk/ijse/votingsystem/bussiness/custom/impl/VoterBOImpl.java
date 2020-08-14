/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.entity.Voter;
import lk.ijse.votingsystem.bussiness.custom.VoterBO;
import lk.ijse.votingsystem.repository.RepositoryFactory;
import lk.ijse.votingsystem.repository.custom.VoterrRepository;
import lk.ijse.votingsystem.resources.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class VoterBOImpl implements VoterBO {

    private VoterrRepository voterrRepository;

    public VoterBOImpl() {
        this.voterrRepository = (VoterrRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.VOTER);
    }

    @Override
    public boolean addVoter(VoterDTO voterDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            voterrRepository.setSession(session);
            session.beginTransaction();

            Voter v = new Voter(voterDTO.getIndexNo(), voterDTO.getName(), voterDTO.getTpNo(), voterDTO.getContact(), voterDTO.getAddress(), voterDTO.getPassword());
            boolean result = voterrRepository.save(v);
            session.getTransaction().commit();
            return result;
        }

    }

    @Override
    public boolean updateVoter(VoterDTO voterDTO) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            voterrRepository.setSession(session);
            session.beginTransaction();
            Voter v = new Voter(voterDTO.getIndexNo(), voterDTO.getName(), voterDTO.getTpNo(), voterDTO.getContact(), voterDTO.getAddress(), voterDTO.getPassword());
            voterrRepository.update(v);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteVoter(String indexNo) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            voterrRepository.setSession(session);
            session.beginTransaction();
            Voter voter = voterrRepository.findById(indexNo);
            boolean result = false;
            if (voter != null) {
                voterrRepository.delete(voter);
            }
            session.getTransaction().commit();
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<VoterDTO> getAllVoter() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            voterrRepository.setSession(session);
            session.beginTransaction();
            List<Voter> voters = voterrRepository.findAll();
            session.getTransaction().commit();
            if (voters != null) {
                List<VoterDTO> allVoters = new ArrayList<>();
                for (Voter voter : voters) {
                    VoterDTO dto = new VoterDTO(voter.getIndexNo(), voter.getName(), voter.getTpNo(), voter.getContact(), voter.getAddress());
                    allVoters.add(dto);
                }

                return allVoters;
            } else {
                return null;
            }
        }

    }

    @Override
    public VoterDTO findVoter(String index) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            voterrRepository.setSession(session);
            session.beginTransaction();
            Voter voter = voterrRepository.findById(index);
            if (voter != null) {
                VoterDTO dto = new VoterDTO(voter.getIndexNo(), voter.getName(), voter.getTpNo(), voter.getContact(), voter.getAddress(), voter.getPassword());
                return dto;
            } else {
                return null;
            }
        }
    }

}
