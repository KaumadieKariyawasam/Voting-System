/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.votingsystem.bussiness.custom.ElectionDetailBO;
import lk.ijse.votingsystem.dto.AllElectionDTO;
import lk.ijse.votingsystem.dto.CommissionDTO;
import lk.ijse.votingsystem.dto.ElectionDTO;
import lk.ijse.votingsystem.dto.ElectionDetailDTO;
import lk.ijse.votingsystem.dto.ElectionDetail_PKDTO;
import lk.ijse.votingsystem.entity.Commission;
import lk.ijse.votingsystem.entity.Election;
import lk.ijse.votingsystem.entity.ElectionDetail;
import lk.ijse.votingsystem.entity.ElectionDetail_PK;
import lk.ijse.votingsystem.entity.Voter;
import lk.ijse.votingsystem.repository.RepositoryFactory;
import lk.ijse.votingsystem.repository.custom.ElectionDetailRepository;
import lk.ijse.votingsystem.repository.custom.ElectionRepository;
import lk.ijse.votingsystem.repository.custom.impl.ElectionDetailRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.impl.ElectionRepositoryImpl;
import lk.ijse.votingsystem.resources.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class ElectionDetailBOImpl implements ElectionDetailBO {

    private ElectionDetailRepository electionDetailRepository;
    private ElectionRepository electionRepository;

    public ElectionDetailBOImpl() {
        //   electionDetailRepository=new ElectionDetailRepositoryImpl();
        // electionRepository=new ElectionRepositoryImpl();
        electionDetailRepository = (ElectionDetailRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ELECTION_DETAIL);
        electionRepository = (ElectionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ELECTION);

    }

    @Override
    public boolean addElection(AllElectionDTO allElectionDTO) throws Exception {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            session.beginTransaction();
            ElectionDetailDTO electionDetailDTO = allElectionDTO.getElectionDetailDTO();
            ElectionDTO electionDTO = allElectionDTO.getElectionDTO();
            CommissionDTO commissionDTO = allElectionDTO.getCommissionDTO();
            boolean isAdded1 = false;
            boolean isAdded2 = false;
            electionRepository.setSession(session);
            electionDetailRepository.setSession(session);

            Election election = new Election();
            election.seteId(electionDTO.geteId());
            election.setElectionYear(electionDTO.getElectionYear());

            isAdded1 = electionRepository.save(election);

            Commission commission = new Commission();
            commission.setCmId(commissionDTO.getCmId());
            ElectionDetail electionDetail = new ElectionDetail();
            electionDetail.setCommission(commission);
            electionDetail.setElection(election);
            electionDetail.setDate(electionDetailDTO.getDate());
            electionDetail.setDescription(electionDetailDTO.getDescription());
            electionDetail.setElectionDate(electionDetailDTO.getElectionDate());
            electionDetail.setEndTime(electionDetailDTO.getEndTime());
            electionDetail.setPlace(electionDetailDTO.getPlace());
            electionDetail.setStartTime(electionDetailDTO.getStartTime());

            ElectionDetail_PKDTO pkDto = electionDetailDTO.getElectionDetail_PKDTO();
            ElectionDetail_PK elePk = new ElectionDetail_PK();

            elePk.setCmId(commissionDTO.getCmId());

            elePk.seteId(electionDTO.geteId());
            electionDetail.setElectionDetail_PK(elePk);
            isAdded2 = electionDetailRepository.save(electionDetail);

        
            if (isAdded1 && isAdded2 ) {
                session.getTransaction().commit();
                return true;
            } else {
                session.getTransaction().rollback();
                return false;
            }

        }
    }

    @Override
    public List<ElectionDetailDTO> getAllDetail() throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            electionDetailRepository.setSession(session);
            session.beginTransaction();
            List<ElectionDetail> electionDetails=electionDetailRepository.findAll();
            session.getTransaction().commit();
            if(electionDetails !=null){
                List<ElectionDetailDTO> allDto=new ArrayList<>();
                for (ElectionDetail electionDetail : electionDetails) {
                    ElectionDetailDTO el=new ElectionDetailDTO(electionDetail.getDate(),electionDetail.getElectionDate(),electionDetail.getStartTime(),electionDetail.getEndTime(),electionDetail.getPlace());
                    ElectionDTO ed=new ElectionDTO();
                    ed.seteId(electionDetail.getElection().geteId());
                    el.setElectionDTO(ed);
                    allDto.add(el);
                }
                return allDto;
            }else{
                return null;
            }
        }

    }
    
}