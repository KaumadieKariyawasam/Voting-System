/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom.impl;

//import lk.ijse.pos.entity.Customer;

import lk.ijse.votingsystem.entity.Voter;
import lk.ijse.votingsystem.repository.SuperRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.VoterrRepository;
import org.hibernate.Session;

//import lk.ijse.pos.repository.SuperRepositoryImpl;
//import lk.ijse.pos.repository.custom.CustomerRepository;

/**
 *
 * @author ranjith-suranga
 */
public class VoterrRepositoryImpl extends SuperRepositoryImpl<Voter, String> implements VoterrRepository {
    
    public VoterrRepositoryImpl(){
        
    }

    @Override
    public void setSession1(Session session) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
