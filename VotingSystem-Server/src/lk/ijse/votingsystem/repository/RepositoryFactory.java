/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.repository;

import java.rmi.RemoteException;
import lk.ijse.votingsystem.repository.custom.impl.CandidateRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.impl.CommissionerRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.impl.ElectionDetailRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.impl.ElectionRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.impl.VoteRepositoryImpl;
import lk.ijse.votingsystem.repository.custom.impl.VoterrRepositoryImpl;

/**
 *
 * @author HP
 */
public class RepositoryFactory {
    public enum RepositoryTypes{
        VOTER,CANDIDATE,COMMISSION,ELECTION_DETAIL,ELECTION,VOTE
    }
    public static RepositoryFactory repositoryFactory;

    private RepositoryFactory() {
    }
    public static RepositoryFactory getInstance(){
        if(repositoryFactory==null){
            repositoryFactory=new RepositoryFactory();
        }
        return repositoryFactory;
    }
    public SuperRepository getRepository(RepositoryTypes types){
        switch(types){
            case VOTER: return new VoterrRepositoryImpl();
            case CANDIDATE: return new CandidateRepositoryImpl();
            case COMMISSION:return new CommissionerRepositoryImpl();
            case ELECTION_DETAIL:return (SuperRepository) new ElectionDetailRepositoryImpl();
            case ELECTION:return new ElectionRepositoryImpl();
            case VOTE:return new VoteRepositoryImpl();
            
            default:return null;
        }
        
    }
    
}
