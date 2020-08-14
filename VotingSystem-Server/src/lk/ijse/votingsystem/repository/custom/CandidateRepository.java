/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom;

import java.util.List;
import lk.ijse.votingsystem.entity.Candidate;
import lk.ijse.votingsystem.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public interface CandidateRepository extends SuperRepository<Candidate, String>{

    public List<Candidate> findSecreatary()throws Exception;

    public void setSession1(Session session)throws Exception;
    
}
