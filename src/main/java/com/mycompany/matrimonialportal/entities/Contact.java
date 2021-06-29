
package com.mycompany.matrimonialportal.entities;


import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Contact {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10, name = "User_id")
    private int userId;
    
    @Column(length = 20, name = "User_name")
    private String userName;
    
    @Column(length = 100, name = "user_email")
    private String userEmail;
    
    @Column(length = 200, name = "user_message")
    private String userMessage;

    public Contact(int userId, String userName, String userEmail, String userMessage) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userMessage = userMessage;
    }

    public Contact(String userName, String userEmail, String userMessage) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userMessage = userMessage;
    }

    public Contact() {
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    @Override
    public String toString() {
        return "Contact{" + "userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userMessage=" + userMessage + '}';
    }

    
    
    
}
