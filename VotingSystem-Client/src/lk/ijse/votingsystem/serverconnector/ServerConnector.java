/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.serverconnector;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.votingsystem.service.ServiceFactory;
import lk.ijse.votingsystem.service.SuperService;
import lk.ijse.votingsystem.service.custom.CandidateService;
import lk.ijse.votingsystem.service.custom.CommissionService;
import lk.ijse.votingsystem.service.custom.ElectionDetailService;

import lk.ijse.votingsystem.service.custom.VoteService;
import lk.ijse.votingsystem.service.custom.VoterService;

/**
 *
 * @author HP
 */
public class ServerConnector implements ServiceFactory{
    private static ServerConnector serverConnector;
    private ServiceFactory serviceFactory;
    private VoterService voterService;
    private CandidateService candidateService;
    private CommissionService commissionService;
    private ElectionDetailService electionDetailService;
    private VoteService voteService;
    
    private ServerConnector(){
        try {
            serviceFactory=(ServiceFactory) Naming.lookup("rmi://localhost:5050/voting");
            voterService=(VoterService) serviceFactory.getService(ServiceTypes.VOTER);
            candidateService=(CandidateService) serviceFactory.getService(ServiceTypes.CANDIDATE);
            commissionService=(CommissionService) serviceFactory.getService(ServiceTypes.COMMISSION);
            electionDetailService=(ElectionDetailService) serviceFactory.getService(ServiceTypes.ELECTION_DETAIL);
            voteService=(VoteService) serviceFactory.getService(ServiceTypes.VOTE);
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ServerConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServerConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ServerConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ServerConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static ServerConnector getInstance(){
        if(serverConnector==null){
            serverConnector=new ServerConnector();
        }
        return serverConnector;
    }
    
    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch(type){
            case VOTER: return voterService;
            case CANDIDATE:return candidateService;
            case COMMISSION:return commissionService;
            case ELECTION_DETAIL:return electionDetailService;
            case VOTE:return voteService;
           
            default:return null;
        }
    }
    
}
