/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom.impl;

import java.io.Serializable;
import java.util.List;
import lk.ijse.votingsystem.dto.VoteDTO;
import lk.ijse.votingsystem.entity.Vote;
import lk.ijse.votingsystem.repository.SuperRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.VoteRepository;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class VoteRepositoryImpl extends SuperRepositoryImpl<Vote, Integer> implements VoteRepository {

    private Session session;
    private String eId="E001";
    public VoteRepositoryImpl() {

    }

    @Override
    public void setSession1(Session session) {
        this.session = session;

    }

    @Override
    public List<Vote> getIndex() throws Exception {
        List<Vote> voteList = session.createSQLQuery("Select indexNo from  vote").list();
        return voteList;
    }

    @Override
    public List<Object[]> getPresidentVote() throws Exception {
       String eId=this.eId;
      
        //System.out.println("eId"+eId);
        List<Object[]> presidentList = session.createSQLQuery("select v.cId,count(v.cId) as tot_vote,c.name from vote v,candidate c where c.cId=v.cId and c.post='President' and v.eId='"+eId+"' group by cId order by tot_vote desc;").list();
        return presidentList;
    }

    @Override
    public List<Object[]> getSecretaaryVote() throws Exception {
        List<Object[]> secList = session.createSQLQuery("select v.cId,count(v.cId) as tot_vote,c.name from vote v,candidate c where c.cId=v.cId and c.post='Secretary' and v.eId='"+eId+"' group by cId order by tot_vote desc;").list();
        return secList;

    }

    @Override
    public List<Object[]> getMembers() throws Exception {
        List<Object[]> memberList = session.createSQLQuery("select v.cId,count(v.cId) as tot_vote,c.name from vote v,candidate c where c.cId=v.cId and c.post='Commission Member' and v.eId='"+eId+"' group by cId order by tot_vote desc;").list();
        return memberList;

    }
}
