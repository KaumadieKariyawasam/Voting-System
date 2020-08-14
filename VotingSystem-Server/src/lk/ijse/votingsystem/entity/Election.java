/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity
public class Election {
    @Id
    private String eId;
    private String electionYear;

    public Election() {
    }

    public Election(String eId, String electionYear) {
        this.eId = eId;
        this.electionYear = electionYear;
    }
    
    @Override
    public String toString() {
        return "Election{" + "eId=" + geteId() + ", electionYear=" + getElectionYear() + '}';
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

    /**
     * @return the electionYear
     */
    public String getElectionYear() {
        return electionYear;
    }

    /**
     * @param electionYear the electionYear to set
     */
    public void setElectionYear(String electionYear) {
        this.electionYear = electionYear;
    }
    
    
    
}
