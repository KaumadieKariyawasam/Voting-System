/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness;

import lk.ijse.votingsystem.bussiness.custom.impl.CandidateBOImpl;
import lk.ijse.votingsystem.bussiness.custom.impl.CommissionBOImpl;
import lk.ijse.votingsystem.bussiness.custom.impl.ElectionDetailBOImpl;
import lk.ijse.votingsystem.bussiness.custom.impl.VoteBOImpl;
import lk.ijse.votingsystem.bussiness.custom.impl.VoterBOImpl;

/**
 *
 * @author HP
 */
public class BOFactory {
    public enum BOTypes{
        VOTER,CANDIDATE,COMMISSION,ELECTION_DETAIL,VOTE
    }
    
    private static BOFactory boFactory;
    
    private BOFactory(){
        
    }
    
    public static BOFactory getInstance(){
        if (boFactory == null){
            boFactory = new BOFactory();
        }
        return boFactory;
    }
    
    public SuperBO getBO(BOTypes type){
        switch(type){
            case VOTER: return new VoterBOImpl();
            case CANDIDATE:return new CandidateBOImpl();
            case COMMISSION:return new CommissionBOImpl();
            case ELECTION_DETAIL:return new ElectionDetailBOImpl();
            case VOTE:return new VoteBOImpl();
            //case VOTE_RESULT:return new VoteResultsBOImpl();
            default:
                return null;
        }
    }
}
