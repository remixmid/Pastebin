package com.example.Pastebin.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email_status")
    private String userEmailStatus;

    @Column(name = "user_location")
    private String userLocation;

    @Column(name = "user_avatar")
    private String userAvatar;

    @Column(name = "user_website_url")
    private String userWebSiteURL;




    public void setId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String isUserEmailStatus() {
        return userEmailStatus;
    }

    public void setUserEmailStatus(String userEmailStatus) {
        this.userEmailStatus = userEmailStatus;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserWebSiteURL() {
        return userWebSiteURL;
    }

    public void setUserWebSiteURL(String userWebSiteURL) {
        this.userWebSiteURL = userWebSiteURL;
    }
}
