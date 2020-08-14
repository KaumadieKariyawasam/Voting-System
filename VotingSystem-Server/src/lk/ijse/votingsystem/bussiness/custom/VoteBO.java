/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom;

import java.util.List;
import lk.ijse.votingsystem.bussiness.SuperBO;
import lk.ijse.votingsystem.dto.ResulltDTO;
import lk.ijse.votingsystem.dto.VoteDTO;
import lk.ijse.votingsystem.dto.VotesDTO;

/**
 *
 * @author HP
 */
public interface VoteBO extends SuperBO{

    public boolean addVote(VoteDTO voteDTO)throws Exception;

    public boolean addVotes(List<VoteDTO> list)throws Exception;

    public boolean addVotess(VotesDTO d)throws Exception;

    public List<VoteDTO> getVoteIndex()throws Exception;

    public List<ResulltDTO> getPresidentResults()throws Exception;

    public List<ResulltDTO> getSecretaryResults()throws Exception;

    public List<ResulltDTO> getMembers()throws Exception;
    
}
