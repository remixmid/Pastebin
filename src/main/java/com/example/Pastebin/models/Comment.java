package com.example.Pastebin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    private int id;

    private String commentText;

    private LocalDateTime commentCreationTime;

    private int commentLikesAmmount;

    private int getCommentDislikesAmmount;

    public int getId() {
        return id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getCommentCreationTime() {
        return commentCreationTime;
    }

    public void setCommentCreationTime(LocalDateTime commentCreationTime) {
        this.commentCreationTime = commentCreationTime;
    }

    public int getCommentLikesAmmount() {
        return commentLikesAmmount;
    }

    public void setCommentLikesAmmount(int commentLikesAmmount) {
        this.commentLikesAmmount = commentLikesAmmount;
    }

    public int getGetCommentDislikesAmmount() {
        return getCommentDislikesAmmount;
    }

    public void setGetCommentDislikesAmmount(int getCommentDislikesAmmount) {
        this.getCommentDislikesAmmount = getCommentDislikesAmmount;
    }
}
