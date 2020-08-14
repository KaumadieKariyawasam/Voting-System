/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.service.custom.impl;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.bussiness.BOFactory;
import lk.ijse.votingsystem.bussiness.custom.VoterBO;
import lk.ijse.votingsystem.observer.Observerr;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.reservation.impl.ReservationImpl;
import lk.ijse.votingsystem.service.custom.VoterService;

/**
 *
 * @author HP
 */
public class VoterServiceImpl extends UnicastRemoteObject implements VoterService,Subjectt{

    private VoterBO voterBO;
    private static ArrayList<Observerr> allObserverrs=new ArrayList<>();
    private static ReservationImpl<VoterService> voterReservation=new ReservationImpl<>();
    
    public VoterServiceImpl()throws Exception{
        this.voterBO=(VoterBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.VOTER);
    }
    @Override
    public boolean addVoter(VoterDTO voterDTO) throws Exception {
        boolean result = voterBO.addVoter(voterDTO);
        notifyObservers();
        return result;
        
    }

    @Override
    public boolean deleteVoter(String indexNo) throws Exception {
        boolean result=false;
        if(voterReservation.reserve(indexNo, this, true)){
            result=voterBO.deleteVoter(indexNo);
            notifyObservers();
            if(voterReservation.isInternalReservation(indexNo)){
                release(indexNo);
            }
        }
        return result;
    }

    @Override
    public boolean updateVoter(VoterDTO voterDTO) throws Exception {
       boolean result = false;
       if(voterReservation.reserve(voterDTO.getIndexNo(), this, result)){
           result=voterBO.updateVoter(voterDTO);
           notifyObservers();
           if(voterReservation.isInternalReservation(voterDTO.getIndexNo())){
               release(voterDTO.getIndexNo());
           }
       }
       return result;
    }

    @Override
    public List<VoterDTO> getAllCustomers() throws Exception {
        return voterBO.getAllVoter();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return voterReservation.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return voterReservation.release(id);
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
    public VoterDTO findVoter(String index) throws Exception {
        return voterBO.findVoter(index);
    }
    
}
