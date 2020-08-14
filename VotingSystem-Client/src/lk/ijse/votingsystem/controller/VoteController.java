/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.controller;

import java.util.List;
import lk.ijse.votingsystem.dto.ResulltDTO;
import lk.ijse.votingsystem.dto.VoteDTO;
import lk.ijse.votingsystem.dto.VotesDTO;
import lk.ijse.votingsystem.observer.Subjectt;
import lk.ijse.votingsystem.serverconnector.ServerConnector;
import lk.ijse.votingsystem.service.ServiceFactory;
import lk.ijse.votingsystem.service.custom.VoteService;

/**
 *
 * @author HP
 */
public class VoteController {
    
    public static Subjectt getSubjectt()throws Exception{
        return (Subjectt) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
    }

    public static boolean addVote(VoteDTO voteDTO)throws Exception{
        VoteService voteService=(VoteService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
        return voteService.addVote(voteDTO);
    }

    public static boolean addVotes(List<VoteDTO> list) throws Exception {
         VoteService voteService=(VoteService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
         System.out.println("service"+voteService);
         System.out.println("uuuu"+list);
         return voteService.addVotes(list);
    }

    public static boolean addVotess(VotesDTO d) throws Exception {
          VoteService voteService=(VoteService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
     
         return voteService.addVotess(d);
    }

    public static List<VoteDTO> getAllVoters()throws Exception{
        VoteService voteService=(VoteService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
        return voteService.getIndex();
    }

    public static List<ResulltDTO> getPresidentVote() throws Exception {
        VoteService voteService=(VoteService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
        return voteService.getPresidentResults();
    }

    public static List<ResulltDTO> getSecretaryVote() throws Exception {
        VoteService voteService=(VoteService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
        return voteService.getSecretaryVote();
    }

    public static List<ResulltDTO> getMembers() throws Exception{
          VoteService voteService=(VoteService) ServerConnector.getInstance().getService(ServiceFactory.ServiceTypes.VOTE);
        return voteService.getMembers();
    }
    
}
