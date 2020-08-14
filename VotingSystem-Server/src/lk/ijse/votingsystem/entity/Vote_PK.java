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
public class Vote_PK implements Serializable {

    @Column(length = 10)
    private String indexNo;
    @Column(length = 10)
    private String cId;

    public Vote_PK() {
    }

    public Vote_PK(String indexNo, String cId) {
        this.indexNo = indexNo;
        this.cId = cId;
    }

    /**
     * @return the indexNo
     */
    public String getIndexNo() {
        return indexNo;
    }

    /**
     * @param indexNo the indexNo to set
     */
    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
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

    @Override
    public String toString() {
        return "Vote_PK{" + "indexNo=" + indexNo + ", cId=" + cId + '}';
    }

}
