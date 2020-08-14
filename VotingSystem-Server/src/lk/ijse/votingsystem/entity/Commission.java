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
public class Commission {
    @Id
    private String cmId;
    private String name;
    private String nic;
    private String tpNo;
    private String address;
    private String userName;
    private String password;

    public Commission() {
    }

    public Commission(String cmId, String name, String nic, String tpNo, String address, String userName, String password) {
        this.cmId = cmId;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
        this.address = address;
        this.userName = userName;
        this.password = password;
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
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
        return "Commission{" + "cmId=" + cmId + ", name=" + name + ", nic=" + nic + ", tpNo=" + tpNo + ", address=" + address + ", userName=" + userName + ", password=" + password + '}';
    }
    
    
           
}
