package com.mycompany.matrimonialportal.entities;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10, name = "User_id")
    private int userId;
    
    @Column(length = 500, name = "User_name")
    private String userName;
    
    @Column(length = 1, name = "User_gender")
    private String userGender;
    
    @Column(length = 10, name = "User_relegion")
    private String userReligion;
    
    @Column(length = 10, name = "User_language")
    private String userMothertongue;
    
    @Column(length = 10, name = "User_cast")
    private String userCAst;
    
    @Column(length = 12, name = "User_phone")
    private String userPhonenumber;
    
    @Column(length = 1500, name = "User_address")
    private String userAddress;
    
    @Column(length = 100, name = "User_email")
    private String userEmail;
    
    @Column(length = 100, name = "User_password")
    private String userPassword;

    public User(int userId, String userName, String userGender, String userReligion, String userMothertongue, String userCAst, String userPhonenumber, String userAddress, String userEmail, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userReligion = userReligion;
        this.userMothertongue = userMothertongue;
        this.userCAst = userCAst;
        this.userPhonenumber = userPhonenumber;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public User(String userName, String userGender, String userReligion, String userMothertongue, String userCAst, String userPhonenumber, String userAddress, String userEmail, String userPassword) {
        this.userName = userName;
        this.userGender = userGender;
        this.userReligion = userReligion;
        this.userMothertongue = userMothertongue;
        this.userCAst = userCAst;
        this.userPhonenumber = userPhonenumber;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public User() {
    }

    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserReligion() {
        return userReligion;
    }

    public void setUserReligion(String userReligion) {
        this.userReligion = userReligion;
    }

    public String getUserMothertongue() {
        return userMothertongue;
    }

    public void setUserMothertongue(String userMothertongue) {
        this.userMothertongue = userMothertongue;
    }

    public String getUserCAst() {
        return userCAst;
    }

    public void setUserCAst(String userCAst) {
        this.userCAst = userCAst;
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", userGender=" + userGender + ", userReligion=" + userReligion + ", userMothertongue=" + userMothertongue + ", userCAst=" + userCAst + ", userPhonenumber=" + userPhonenumber + ", userAddress=" + userAddress + ", userEmail=" + userEmail + ", userPassword=" + userPassword + '}';
    }

    public boolean getUserType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
