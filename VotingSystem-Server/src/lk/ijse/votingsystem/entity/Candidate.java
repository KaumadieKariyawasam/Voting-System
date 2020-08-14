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
public class Candidate {
    @Id
    private String cId;
    private String indexNo;
    private String name;
    private String nic;
    private String tpNo;
    private String email;
    private String address;
    private String password;
    private String post;
    private byte[] image;
    private String designationDetail;
    private String serviceDetail;
    private String visionDetail;
    private String otherDetail;
    private String fileName;

    public Candidate() {
    }

    public Candidate(String cId, String indexNo, String name, String nic, String tpNo, String email, String address, String password, String post, byte[] image, String designationDetail, String serviceDetail, String visionDetail, String otherDetail, String fileName) {
        this.cId = cId;
        this.indexNo = indexNo;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
        this.email = email;
        this.address = address;
        this.password = password;
        this.post = post;
        this.image = image;
        this.designationDetail = designationDetail;
        this.serviceDetail = serviceDetail;
        this.visionDetail = visionDetail;
        this.otherDetail = otherDetail;
        this.fileName = fileName;
    }
    
    public Candidate(String cId, String indexNo, String name, String nic, String tpNo, String email, String address, String password, String post, byte[] image) {
        this.cId = cId;
        this.indexNo = indexNo;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
        this.email = email;
        this.address = address;
        this.password = password;
        this.post = post;
        this.image = image;
    }

    public Candidate(String cId, String indexNo, String name, String nic, String tpNo, String email, String address, String password, String post, byte[] image, String designationDetail, String serviceDetail, String visionDetail, String otherDetail) {
        this.cId = cId;
        this.indexNo = indexNo;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
        this.email = email;
        this.address = address;
        this.password = password;
        this.post = post;
        this.image = image;
        this.designationDetail = designationDetail;
        this.serviceDetail = serviceDetail;
        this.visionDetail = visionDetail;
        this.otherDetail = otherDetail;
    }

    public Candidate(String cId, String indexNo, String name, String nic, String tpNo, String email, String address, String password, String post, byte[] image, String fileName) {
        this.cId = cId;
        this.indexNo = indexNo;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
        this.email = email;
        this.address = address;
        this.password = password;
        this.post = post;
        this.image = image;
        this.fileName=fileName;
    }

    public Candidate(String cId) {
        this.cId=cId;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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

    /**
     * @return the image
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(byte[] image) {
        this.image = image;
    }

    /**
     * @return the designationDetail
     */
    public String getDesignationDetail() {
        return designationDetail;
    }

    /**
     * @param designationDetail the designationDetail to set
     */
    public void setDesignationDetail(String designationDetail) {
        this.designationDetail = designationDetail;
    }

    /**
     * @return the serviceDetail
     */
    public String getServiceDetail() {
        return serviceDetail;
    }

    /**
     * @param serviceDetail the serviceDetail to set
     */
    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    /**
     * @return the visionDetail
     */
    public String getVisionDetail() {
        return visionDetail;
    }

    /**
     * @param visionDetail the visionDetail to set
     */
    public void setVisionDetail(String visionDetail) {
        this.visionDetail = visionDetail;
    }

    /**
     * @return the otherDetail
     */
    public String getOtherDetail() {
        return otherDetail;
    }

    /**
     * @param otherDetail the otherDetail to set
     */
    public void setOtherDetail(String otherDetail) {
        this.otherDetail = otherDetail;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Candidate{" + "cId=" + cId + ", indexNo=" + indexNo + ", name=" + name + ", nic=" + nic + ", tpNo=" + tpNo + ", email=" + email + ", address=" + address + ", password=" + password + ", post=" + post + ", image=" + image + ", designationDetail=" + designationDetail + ", serviceDetail=" + serviceDetail + ", visionDetail=" + visionDetail + ", otherDetail=" + otherDetail + ", fileName=" + fileName + '}';
    }

   

}
