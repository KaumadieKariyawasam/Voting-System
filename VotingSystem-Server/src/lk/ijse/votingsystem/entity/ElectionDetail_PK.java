/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
   
/**
 *
 * @author HP
 */
@Embeddable
public class ElectionDetail_PK implements Serializable{
@Column(length = 10)
private String cmId;
@Column(length = 10)
private String eId;

    public ElectionDetail_PK() {
    }

    public ElectionDetail_PK(String cmId, String eId) {
        this.cmId = cmId;
        this.eId = eId;
    }

    /**
     * @return the cmId
     */
    public String getCmId() {
        return cmId;
    }

    /**
     * @param cmId the cmId to set
     */
    public void setCmId(String cmId) {
        this.cmId = cmId;
    }

    /**
     * @return the eId
     */
    public String geteId() {
        return eId;
    }

    /**
     * @param eId the eId to set
     */
    public void seteId(String eId) {
        this.eId = eId;
    }

    @Override
    public String toString() {
        return "ElectionDetail_PK{" + "cmId=" + cmId + ", eId=" + eId + '}';
    }
    
    
}
