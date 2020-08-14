/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.bussiness.custom;

import java.util.List;
import lk.ijse.votingsystem.bussiness.SuperBO;
import lk.ijse.votingsystem.dto.CommissionDTO;

/**
 *
 * @author HP
 */
public interface CommissionBO extends SuperBO{
    public boolean addCommissioner(CommissionDTO commissionDTO) throws Exception;
    
    public boolean updateCommission(CommissionDTO commissionDTO) throws Exception;
    
    public boolean deleteCommissioner(String cmId) throws Exception;
    
    public List<CommissionDTO> getAllCommissioners() throws Exception;

    public CommissionDTO findCommissioner(String cmId) throws Exception;
}
