/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.controller;

import java.util.List;
import javax.security.auth.Subject;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.serverconnector.ServerConnector;
import lk.ijse.votingsystem.service.ServiceFactory;
import lk.ijse.votingsystem.service.custom.CandidateService;

/**
 *
 * @author HP
 */
public class CandidateController {

    public static boolean addCandidate(CandidateDTO candidateDTO) throws Exception {
        CandidateService candidateService=(CandidateService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
        return candidateService.addCandidate(candidateDTO);
        
    }
    
    public static Subjectt getSubject() throws Exception{
        return (Subjectt) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
    }
    
    public static boolean reserveCustomer(String indexNo) throws Exception{
        CandidateService candidateService=(CandidateService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
        return candidateService.reserve(indexNo);
    }
    
    public static boolean releaseCustomer(String indexNo) throws Exception{
        CandidateService candidateService=(CandidateService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
        return candidateService.release(indexNo);
        
    }    

    public static List<CandidateDTO> getAllCandidates()throws Exception{
        
        CandidateService candidateService=(CandidateService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
        return candidateService.getAllCandidates();
    }

    public static CandidateDTO searchCandidate(String index) throws Exception{
        CandidateService candidateService=(CandidateService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
        return candidateService.findCandidate(index);
    }

   

    public static boolean updateCandidate(CandidateDTO candidateDTO) throws Exception {
        CandidateService candidateService=(CandidateService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
        return candidateService.updateCandidate(candidateDTO);
        
    }

    public static List<CandidateDTO> getSercretary()throws Exception{
        CandidateService candidateService=(CandidateService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.CANDIDATE);
        return candidateService.getSecretary();
    }
    
}
