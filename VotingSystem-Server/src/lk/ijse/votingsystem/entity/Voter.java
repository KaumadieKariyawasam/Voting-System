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
public class Voter {
    @Id
    private String indexNo;
    private String name;
    private String tpNo;
    private String contact;
    private String address;
    private String password;
    

    public Voter() {
    }

    public Voter(String indexNo, String name, String tpNo, String contact, String address, String password) {
        this.indexNo = indexNo;
        this.name = name;
        this.tpNo = tpNo;
        this.contact = contact;
        this.address = address;
        this.password = password;
    }

    public Voter(String indexNo) {
        this.indexNo=indexNo;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tpNo
     */
    public String getTpNo() {
        return tpNo;
    }

    /**
     * @param tpNo the tpNo to set
     */
    public void setTpNo(String tpNo) {
        this.tpNo = tpNo;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Voter{" + "indexNo=" + indexNo + ", name=" + name + ", tpNo=" + tpNo + ", contact=" + contact + ", address=" + address + ", password=" + password + '}';
    }
    
    
}
