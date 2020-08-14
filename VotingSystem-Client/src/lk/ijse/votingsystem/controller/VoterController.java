/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.controller;

import java.util.List;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.serverconnector.ServerConnector;
import lk.ijse.votingsystem.service.ServiceFactory;
import lk.ijse.votingsystem.service.custom.VoterService;

/**
 *
 * @author HP
 */
public class VoterController {

    public static boolean addVoters(VoterDTO voterDTO) throws Exception {
        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
        return voterService.addVoter(voterDTO);
    }
    public static Subjectt getSubject() throws Exception{
        return (Subjectt) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
    }
    
    public static boolean reserveCustomer(String indexNo) throws Exception{
        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
        return voterService.reserve(indexNo);
        
    }
    
    public static boolean releaseCustomer(String indexNo) throws Exception{
        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
        return voterService.release(indexNo);
        
    }    

    public static List<VoterDTO> getAllVoter() throws Exception {
        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
        return voterService.getAllCustomers();
    }

    public static VoterDTO searchVoter(String index) throws Exception {
        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
        return voterService.findVoter(index);
    }

    public static boolean updateVoter(VoterDTO voterDTO) throws Exception {
        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
        return voterService.updateVoter(voterDTO);
    }

    public static boolean deleteVoter(String text) throws Exception {
        VoterService voterService=(VoterService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTER);
        return voterService.deleteVoter(text);
    }

    

   

}
