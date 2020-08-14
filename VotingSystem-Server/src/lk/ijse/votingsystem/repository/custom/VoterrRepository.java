/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom;

//import lk.ijse.pos.repository.SuperRepository;
import lk.ijse.votingsystem.entity.Voter;
import lk.ijse.votingsystem.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author ranjith-suranga
 */
public interface VoterrRepository extends SuperRepository<Voter, String>{

    public void setSession1(Session session);
    
}
