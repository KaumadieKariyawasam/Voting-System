/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom;

import java.util.List;
import lk.ijse.votingsystem.entity.Vote;
import lk.ijse.votingsystem.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public interface VoteRepository extends SuperRepository<Vote,Integer>{

    public void setSession1(Session session);

    public List<Vote> getIndex()throws Exception;

    public List<Object[]> getPresidentVote()throws Exception;

    public List<Object[]> getSecretaaryVote()throws Exception;

    public List<Object[]> getMembers()throws Exception;
    
}
