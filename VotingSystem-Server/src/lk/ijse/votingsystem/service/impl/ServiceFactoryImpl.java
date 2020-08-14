/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.votingsystem.service.ServiceFactory;
import lk.ijse.votingsystem.service.SuperService;
import lk.ijse.votingsystem.service.custom.impl.CandidateServiceeImpl;
import lk.ijse.votingsystem.service.custom.impl.CommissionServiceImpl;
import lk.ijse.votingsystem.service.custom.impl.ElectionDetailServiceImpl;

import lk.ijse.votingsystem.service.custom.impl.VoteServiceImpl;
//import lk.ijse.votingsystem.service.custom.impl.CandidateServiceImpl;
import lk.ijse.votingsystem.service.custom.impl.VoterServiceImpl;


/**
 *
 * @author HP
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory{
    
    public static ServiceFactory serviceFactory;
    
    private ServiceFactoryImpl() throws RemoteException{
        
    }
    
    public static ServiceFactory getInstance() throws RemoteException{
        if (serviceFactory == null){
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch(type){
            case VOTER: return new VoterServiceImpl();
            case CANDIDATE:return new CandidateServiceeImpl();
            case COMMISSION:return new CommissionServiceImpl();
            case ELECTION_DETAIL:return new ElectionDetailServiceImpl();
            case VOTE:return new VoteServiceImpl();
            
            default:return null;
        }
    }
    
}
