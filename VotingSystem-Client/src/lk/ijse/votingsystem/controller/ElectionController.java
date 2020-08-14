/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.controller;

import java.util.List;
import lk.ijse.votingsystem.dto.AllElectionDTO;
import lk.ijse.votingsystem.dto.ElectionDetailDTO;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.serverconnector.ServerConnector;
import lk.ijse.votingsystem.service.ServiceFactory;
import lk.ijse.votingsystem.service.custom.ElectionDetailService;

/**
 *
 * @author HP
 */
public class ElectionController {

    public static boolean addElection(AllElectionDTO allElectionDTO) throws Exception {
        ElectionDetailService electionDetailService=(ElectionDetailService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.ELECTION_DETAIL);
        System.out.println("ElectionController"+electionDetailService);
        return electionDetailService.addElection(allElectionDTO);
    }
    public static Subjectt getSubject() throws Exception{
        return (Subjectt) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.ELECTION_DETAIL);
    }
    
//    public static boolean reserveCustomer(String indexNo) throws Exception{
//        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
//        return voterService.reserve(indexNo);
//        
//    }
//    
//    public static boolean releaseCustomer(String indexNo) throws Exception{
//        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
//        return voterService.release(indexNo);
//        
//    }    

    public static List<ElectionDetailDTO> getAll() throws Exception{
        ElectionDetailService electionDetailService=(ElectionDetailService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.ELECTION_DETAIL);
        return electionDetailService.getAllDeatil();
    }
}
