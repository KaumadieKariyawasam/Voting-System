/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author HP
 */
@Entity
public class ElectionDetail implements Serializable{
  
    private String date;
    private String electionDate;
    private String startTime;
    private String endTime;
    private String place;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cmId",referencedColumnName = "cmId",insertable = false,updatable = false)
    private Commission commission;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eId",referencedColumnName = "eId",insertable = false,updatable = false)
    private Election election;
    
    @EmbeddedId // ///////////////////////////
    private ElectionDetail_PK electionDetail_PK;

    public ElectionDetail() {
    }


    public ElectionDetail(String cmId,String eId,String date, String electionDate, String startTime, String endTime, String place, String description, Commission commission, Election election, ElectionDetail_PK electionDetail_PK) {
        this.date = date;
        this.electionDate = electionDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.place = place;
        this.description = description;
        this.commission = commission;
        this.election = election;
        this.electionDetail_PK = new ElectionDetail_PK(cmId, eId);
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the electionDate
     */
    public String getElectionDate() {
        return electionDate;
    }

    /**
     * @param electionDate the electionDate to set
     */
    public void setElectionDate(String electionDate) {
        this.electionDate = electionDate;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the commission
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * @param commission the commission to set
     */
    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    /**
     * @return the election
     */
    public Election getElection() {
        return election;
    }

    /**
     * @param election the election to set
     */
    public void setElection(Election election) {
        this.election = election;
    }

    /**
     * @return the electionDetail_PK
     */
    public ElectionDetail_PK getElectionDetail_PK() {
        return electionDetail_PK;
    }

    /**
     * @param electionDetail_PK the electionDetail_PK to set
     */
    public void setElectionDetail_PK(ElectionDetail_PK electionDetail_PK) {
        this.electionDetail_PK = electionDetail_PK;
    }

    @Override
    public String toString() {
        return "ElectionDetail{" + "date=" + date + ", electionDate=" + electionDate + ", startTime=" + startTime + ", endTime=" + endTime + ", place=" + place + ", description=" + description + ", commission=" + commission + ", election=" + election + ", electionDetail_PK=" + electionDetail_PK + '}';
    }

   
   
    
}
