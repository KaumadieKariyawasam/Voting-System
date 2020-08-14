/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom.impl;

import java.io.Serializable;
import java.util.List;
import lk.ijse.votingsystem.entity.Election;
import lk.ijse.votingsystem.repository.SuperRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.ElectionRepository;
import org.hibernate.Session;
import sun.security.pkcs11.wrapper.Functions;

/**
 *
 * @author HP
 */
public class ElectionRepositoryImpl extends SuperRepositoryImpl<Election,String> implements ElectionRepository{
//    private Session session;
//    public ElectionRepositoryImpl(){
//        
//    }
//
//    @Override
//    public boolean addElection(Election election) throws Exception {
//        Serializable save=session.save(election);
//        if (save != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public void setSession(Session session){
//        this.session=session;
//    }
//
//    @Override
//    public boolean save(Election t) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void delete(Election t) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void update(Election t) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Election findById(String id) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Election> findAll() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
