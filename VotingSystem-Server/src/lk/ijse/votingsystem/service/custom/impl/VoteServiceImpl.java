 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.votingsystem.bussiness.BOFactory;
import lk.ijse.votingsystem.bussiness.custom.VoteBO;
import lk.ijse.votingsystem.dto.ResulltDTO;
import lk.ijse.votingsystem.dto.VoteDTO;
import lk.ijse.votingsystem.dto.VotesDTO;
import lk.ijse.votingsystem.observer.Observerr;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.service.custom.VoteService;

/**
 *
 * @author HP
 */
public class VoteServiceImpl extends UnicastRemoteObject implements VoteService,Subjectt{
    private VoteBO voteBO;
    private static ArrayList<Observerr> allObserverrs=new ArrayList<>();
    public VoteServiceImpl()throws RemoteException{
        voteBO=(VoteBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.VOTE);
    }
    @Override
    public boolean reserve(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean release(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerObserver(Observerr observer) throws Exception {
        allObserverrs.add(observer);
    }

    @Override
    public void unregisterObserver(Observerr observer) throws Exception {
        allObserverrs.remove(observer);
    }

    @Override
    public void notifyObservers() throws Exception {
        new Thread(() -> {
            for (Observerr observerr : allObserverrs) {
                try {
                    observerr.updateObservers();
                } catch (Exception ex) {
                    Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean addVote(VoteDTO voteDTO) throws Exception {
        boolean result=voteBO.addVote(voteDTO);
        notifyObservers();
        return result;
    }

    @Override
    public boolean addVotes(List<VoteDTO> list) throws Exception {
          boolean result=voteBO.addVotes(list);
        notifyObservers();
        return result;
    }

    @Override
    public boolean addVotess(VotesDTO d) throws Exception {
        boolean result=voteBO.addVotess(d);
        notifyObservers();
        return result;
    }

    @Override
    public List<VoteDTO> getIndex() throws Exception {
        List<VoteDTO> indexList=voteBO.getVoteIndex();
        return indexList;
    }

    @Override
    public List<ResulltDTO> getPresidentResults() throws Exception {
        return voteBO.getPresidentResults();
    }

    @Override
    public List<ResulltDTO> getSecretaryVote() throws Exception {
        return voteBO.getSecretaryResults();
    }

    @Override
    public List<ResulltDTO> getMembers() throws Exception {
        return voteBO.getMembers();
    }
    
}
