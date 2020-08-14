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
import lk.ijse.votingsystem.bussiness.BOFactory;
import lk.ijse.votingsystem.bussiness.custom.ElectionDetailBO;
import lk.ijse.votingsystem.dto.AllElectionDTO;
import lk.ijse.votingsystem.dto.ElectionDetailDTO;
import lk.ijse.votingsystem.observer.Observerr;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.reservation.impl.ReservationImpl;
import lk.ijse.votingsystem.service.custom.ElectionDetailService;

/**
 *
 * @author HP
 */
public class ElectionDetailServiceImpl extends UnicastRemoteObject implements ElectionDetailService,Subjectt{
    
    private ElectionDetailBO electionDetailBO;
    private static ArrayList<Observerr> allObserver=new ArrayList<>();
    private static ReservationImpl<ElectionDetailService> electionReservation=new ReservationImpl<>();
    
    public ElectionDetailServiceImpl()throws Exception{
        electionDetailBO=(ElectionDetailBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ELECTION_DETAIL);
    }
    @Override
    public boolean reserve(Object id) throws Exception {
        return electionReservation.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return electionReservation.release(id);
    }

    @Override
    public boolean addElection(AllElectionDTO allElectionDTO) throws Exception {
        boolean result = electionDetailBO.addElection(allElectionDTO);
        
     //   notifyObservers();
        return result;

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
    public List<ElectionDetailDTO> getAllDeatil() throws Exception {
        return electionDetailBO.getAllDetail();
    }
    
}
