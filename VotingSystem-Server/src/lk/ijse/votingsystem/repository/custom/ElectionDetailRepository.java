/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository.custom;

import lk.ijse.votingsystem.entity.Election;
import lk.ijse.votingsystem.entity.ElectionDetail;
import lk.ijse.votingsystem.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public interface ElectionDetailRepository extends SuperRepository<ElectionDetail,String>{

//    public void setSession(Session session)throws Exception;
//
//    public boolean addElectionDetaion(ElectionDetail electionDetail)throws Exception;

    
   
}
