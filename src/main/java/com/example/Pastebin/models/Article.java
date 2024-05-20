package com.example.Pastebin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Article {

    @Id
    private int articleId;

    private LocalDateTime articleCreationTime;

    private LocalDateTime articleDeleteTime;

    private int rating;

    private int articleVisitorsAmount;

    public int getArticleId() {
        return articleId;
    }

    public LocalDateTime getArticleCreationTime() {
        return articleCreationTime;
    }

    public void setArticleCreationTime(LocalDateTime articleCreationTime) {
        this.articleCreationTime = articleCreationTime;
    }

    public LocalDateTime getArticleDeleteTime() {
        return articleDeleteTime;
    }

    public void setArticleDeleteTime(LocalDateTime articleDeleteTime) {
        this.articleDeleteTime = articleDeleteTime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getArticleVisitorsAmount() {
        return articleVisitorsAmount;
    }

    public void setArticleVisitorsAmount(int articleVisitorsAmount) {
        this.articleVisitorsAmount = articleVisitorsAmount;
    }
}
