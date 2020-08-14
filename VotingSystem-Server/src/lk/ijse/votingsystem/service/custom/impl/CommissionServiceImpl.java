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
import lk.ijse.votingsystem.bussiness.custom.CommissionBO;
import lk.ijse.votingsystem.dto.CommissionDTO;
import lk.ijse.votingsystem.observer.Observerr;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.reservation.impl.ReservationImpl;
import lk.ijse.votingsystem.service.custom.CommissionService;

/**
 *
 * @author HP
 */
public class CommissionServiceImpl extends UnicastRemoteObject implements CommissionService,Subjectt{
    private CommissionBO commissionBO;
    private static ArrayList<Observerr> allObserver=new ArrayList<>();
    private static ReservationImpl<CommissionService> commissionReservation=new ReservationImpl<>();
    public CommissionServiceImpl()throws RemoteException{
        commissionBO=(CommissionBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COMMISSION);
    }
    @Override
    public boolean addCommissioner(CommissionDTO commissionDTO) throws Exception {
         boolean result=commissionBO.addCommissioner(commissionDTO);
        notifyObservers();
        return result;
    }

    @Override
    public boolean deleteCommissioner(String cmId) throws Exception {
        boolean result=false;
        if(commissionReservation.reserve(cmId, this, true)){
            result=commissionBO.deleteCommissioner(cmId);
            notifyObservers();
            if(commissionReservation.isInternalReservation(cmId)){
                release(cmId);
            }
        }
        return result;
    }

    @Override
    public boolean updateCommissioner(CommissionDTO commissionDTO) throws Exception {
        boolean result=false;
        
        if(commissionReservation.reserve(commissionDTO.getCmId(), this, result)){
            result=commissionBO.updateCommission(commissionDTO);
            notifyObservers();
            if(commissionReservation.isInternalReservation(commissionDTO.getCmId())){
                release(commissionDTO.getCmId());
            }
        }
        return result;
    }

    @Override
    public List<CommissionDTO> getAllCommissioner() throws Exception {
        return commissionBO.getAllCommissioners();
    }

    @Override
    public CommissionDTO findCommissioner(String cmId) throws Exception {
        return commissionBO.findCommissioner(cmId);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return commissionReservation.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return commissionReservation.release(id);
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
    
}
