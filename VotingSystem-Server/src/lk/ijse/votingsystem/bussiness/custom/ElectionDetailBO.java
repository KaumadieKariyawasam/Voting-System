/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom;

import java.util.List;
import lk.ijse.votingsystem.bussiness.SuperBO;
import lk.ijse.votingsystem.dto.AllElectionDTO;
import lk.ijse.votingsystem.dto.ElectionDetailDTO;

/**
 *
 * @author HP
 */
public interface ElectionDetailBO extends SuperBO{

    public boolean addElection(AllElectionDTO allElectionDTO)throws Exception;

    public List<ElectionDetailDTO> getAllDetail()throws Exception;
    
}
