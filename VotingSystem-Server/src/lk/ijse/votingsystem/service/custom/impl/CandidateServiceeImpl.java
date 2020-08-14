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
import lk.ijse.votingsystem.bussiness.custom.CandidateBO;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.observer.Observerr;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.reservation.impl.ReservationImpl;
import lk.ijse.votingsystem.service.custom.CandidateService;

/**
 *
 * @author HP
 */
public class CandidateServiceeImpl extends UnicastRemoteObject implements CandidateService,Subjectt{
    private CandidateBO candidateBO;
    private static ArrayList<Observerr> allObserver=new ArrayList<>();
    private static ReservationImpl<CandidateService> candidateReservation=new ReservationImpl<>();
    public CandidateServiceeImpl()throws RemoteException{
        candidateBO=(CandidateBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CANDIDATE);
        
    }
    @Override
    public boolean addCandidate(CandidateDTO candidateDTO) throws Exception {
        boolean result=candidateBO.addCandidate(candidateDTO);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteCandidate(String indexNo) throws Exception {
        boolean result=false;
        if(candidateReservation.reserve(indexNo, this, true)){
            result=candidateBO.deleteCandidate(indexNo);
            notifyObservers();
            if(candidateReservation.isInternalReservation(indexNo)){
                release(indexNo);
            }
        }
        return result;
    }

    @Override
    public boolean updateCandidate(CandidateDTO candidateDTO) throws Exception {
        boolean result=false;
        if(candidateReservation.reserve(candidateDTO.getIndexNo(), this, result)){
            result=candidateBO.updateCandidate(candidateDTO);
            notifyObservers();
            if(candidateReservation.isInternalReservation(candidateDTO.getIndexNo())){
                release(candidateDTO.getIndexNo());
            }
        }
        return result;
    }

    @Override
    public List<CandidateDTO> getAllCandidates() throws Exception {
        return candidateBO.getAllCandidate();
    }

    @Override
    public CandidateDTO findCandidate(String index) throws Exception {
        return candidateBO.findCandidate(index);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return candidateReservation.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return candidateReservation.release(id);
    }

    @Override
    public void registerObserver(Observerr observer) throws Exception {
        allObserver.add(observer);
    }

    @Override
    public void unregisterObserver(Observerr observer) throws Exception {
        allObserver.remove(observer);
    }

    @Override
    public void notifyObservers() throws Exception {
        new Thread(() -> {
            for (Observerr observerr : allObserver) {
                try {
                    observerr.updateObservers();
                } catch (Exception ex) {
                    Logger.getLogger(VoterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public List<CandidateDTO> getSecretary() throws Exception {
        return candidateBO.getSecretary();
    }
    
}
