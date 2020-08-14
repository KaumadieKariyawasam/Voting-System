/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom;

import java.util.List;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.bussiness.SuperBO;

/**
 *
 * @author HP
 */
public interface VoterBO extends SuperBO{
     public boolean addVoter(VoterDTO voterDTO) throws Exception;
    
    public boolean updateVoter(VoterDTO voterDTO) throws Exception;
    
    public boolean deleteVoter(String indexNo) throws Exception;
    
    public List<VoterDTO> getAllVoter() throws Exception;

    public VoterDTO findVoter(String index)throws Exception;
}
