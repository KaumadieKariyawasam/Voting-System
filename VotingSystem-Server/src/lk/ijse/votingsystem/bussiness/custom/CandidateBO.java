/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom;

import java.util.List;
import lk.ijse.votingsystem.bussiness.SuperBO;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.dto.VoterDTO;

/**
 *
 * @author HP
 */
public interface CandidateBO extends SuperBO{
    public boolean addCandidate(CandidateDTO candidateDTO) throws Exception;
    
    public boolean updateCandidate(CandidateDTO candidateDTO) throws Exception;
    
    public boolean deleteCandidate(String indexNo) throws Exception;
    
    public List<CandidateDTO> getAllCandidate() throws Exception;

    public CandidateDTO findCandidate(String index)throws Exception;

    public List<CandidateDTO> getSecretary()throws Exception;
}
