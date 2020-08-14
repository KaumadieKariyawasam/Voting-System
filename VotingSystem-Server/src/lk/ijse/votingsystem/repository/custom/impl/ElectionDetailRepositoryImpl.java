/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom.impl;

import java.io.Serializable;
import lk.ijse.votingsystem.bussiness.custom.ElectionDetailBO;
import lk.ijse.votingsystem.entity.ElectionDetail;
import lk.ijse.votingsystem.repository.SuperRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.ElectionDetailRepository;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class ElectionDetailRepositoryImpl extends SuperRepositoryImpl<ElectionDetail,String> implements ElectionDetailRepository{
//    private Session session;
//    @Override
//    public void setSession(Session session) throws Exception {
//        this.session=session;
//    }
//
//    @Override
//    public boolean addElectionDetaion(ElectionDetail electionDetail) throws Exception {
//        Serializable save=session.save(electionDetail);
//        if (save != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
}
