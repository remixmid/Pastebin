package com.example.Pastebin.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private int articleId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "article_text")
    private String articleText;

    @Column(name = "article_creation_time")
    private LocalDateTime articleCreationTime;

    @Column(name = "article_delete_time")
    private LocalDateTime articleDeleteTime;

    @Column(name = "article_rating")
    private int rating;

    @Column(name = "article_visitors_amount")
    private int articleVisitorsAmount;
}
