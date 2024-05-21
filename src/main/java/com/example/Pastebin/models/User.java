package com.example.Pastebin.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
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
}
