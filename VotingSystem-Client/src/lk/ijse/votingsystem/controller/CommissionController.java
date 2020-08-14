/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.controller;

import java.util.List;
import lk.ijse.votingsystem.dto.CommissionDTO;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.serverconnector.ServerConnector;
import lk.ijse.votingsystem.service.ServiceFactory;
import lk.ijse.votingsystem.service.custom.CommissionService;

/**
 *
 * @author HP
 */
public class CommissionController {
    
    public static Subjectt getSubjectt()throws Exception{
        return (Subjectt) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
    }
    public static boolean reserveCommissioner(String cmId)throws Exception{
        CommissionService commissionService=(CommissionService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
        return commissionService.reserve(cmId);
    }
    public static boolean releaseCommioner(String cmId)throws Exception{
        CommissionService commissionService=(CommissionService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
        return commissionService.release(cmId);
    }

    public static boolean addCommioner(CommissionDTO commissionDTO) throws Exception {
        CommissionService commissionService=(CommissionService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
        return commissionService.addCommissioner(commissionDTO);
    }

    public static CommissionDTO findCommissioner(String text) throws Exception {
        CommissionService commissionService=(CommissionService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
        return commissionService.findCommissioner(text);
    }

    public static boolean updateCommissioner(CommissionDTO commissionDTO) throws Exception {
        CommissionService commissionService=(CommissionService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
        return commissionService.updateCommissioner(commissionDTO);
    }

    public static boolean deleteCommissioner(String text) throws Exception {
        CommissionService commissionService=(CommissionService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
        return commissionService.deleteCommissioner(text);
    }

    public static List<CommissionDTO> getAllMembers() throws Exception {
        CommissionService commissionService=(CommissionService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.COMMISSION);
        return commissionService.getAllCommissioner();
    }
}
