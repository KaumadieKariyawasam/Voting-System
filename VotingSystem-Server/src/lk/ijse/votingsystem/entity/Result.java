/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.entity;

/**
 *
 * @author HP
 */
public class Result {
    private String cId;
    private String totVote;
    private String post;

    public Result() {
    }

    public Result(String cId, String totVote, String post) {
        this.cId = cId;
        this.totVote = totVote;
        this.post = post;
    }

    /**
     * @return the cId
     */
    public String getcId() {
        return cId;
    }

    /**
     * @param cId the cId to set
     */
    public void setcId(String cId) {
        this.cId = cId;
    }

    /**
     * @return the totVote
     */
    public String getTotVote() {
        return totVote;
    }

    /**
     * @param totVote the totVote to set
     */
    public void setTotVote(String totVote) {
        this.totVote = totVote;
    }

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }
    
    
}
