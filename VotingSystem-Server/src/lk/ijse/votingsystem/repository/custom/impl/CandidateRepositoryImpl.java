/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.votingsystem.entity.Candidate;
import lk.ijse.votingsystem.repository.SuperRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.CandidateRepository;
import org.hibernate.Session;
import sun.security.pkcs11.wrapper.Functions;

/**
 *
 * @author HP
 */
public class CandidateRepositoryImpl extends SuperRepositoryImpl<Candidate,String>implements CandidateRepository{
    private Session session;
    public CandidateRepositoryImpl(){
        
    }
   
    @Override
    public List<Candidate> findSecreatary() throws Exception {
        List<Candidate> secreList=secreList=session.createQuery("Select cId,post from Candidate where post='Secretary'").list();

        if(secreList!=null){
            return secreList;
        }else{
            return null;
        }
    }

    @Override
    public void setSession1(Session session) throws Exception {
        this.session=session;
    }
    
}
