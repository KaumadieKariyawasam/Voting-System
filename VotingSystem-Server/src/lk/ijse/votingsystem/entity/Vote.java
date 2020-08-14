/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Generated;

/**
 *
 * @author HP
 */
@Entity
public class Vote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private int voteId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "indexNo", referencedColumnName = "indexNo", insertable = false, updatable = false)
    private Voter voter;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cId", referencedColumnName = "cId", insertable = false, updatable = false)
    private Candidate candidate;
    @EmbeddedId
    private Vote_PK vote_Pk;
    private String eId;
    public Vote() {
    }

    public Vote(int voteId,String indexNo,String cId, Voter voter, Candidate candidate) {
        this.voteId = voteId;
        this.voter = voter;
        this.candidate = candidate;
        this.vote_Pk= new Vote_PK(indexNo, cId);
    }

    public Vote(int voteId, Voter voter, Candidate candidate, Vote_PK vote_Pk, String eId) {
        this.voteId = voteId;
        this.voter = voter;
        this.candidate = candidate;
        this.vote_Pk = vote_Pk;
        this.eId = eId;
    }

    /**
     * @return the voteId
     */
    public int getVoteId() {
        return voteId;
    }

    /**
     * @param voteId the voteId to set
     */
    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    /**
     * @return the voter
     */
    public Voter getVoter() {
        return voter;
    }

    /**
     * @param voter the voter to set
     */
    public void setVoter(Voter voter) {
        this.voter = voter;
    }

    /**
     * @return the candidate
     */
    public Candidate getCandidate() {
        return candidate;
    }

    /**
     * @param candidate the candidate to set
     */
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    /**
     * @return the vote_Pk
     */
    public Vote_PK getVote_Pk() {
        return vote_Pk;
    }

    /**
     * @param vote_Pk the vote_Pk to set
     */
    public void setVote_Pk(Vote_PK vote_Pk) {
        this.vote_Pk = vote_Pk;
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
    
    
    

}
