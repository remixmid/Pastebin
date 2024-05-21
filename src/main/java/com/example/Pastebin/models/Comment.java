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
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "comment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "comment_text")
    private String commentText;

    @Column(name = "comment_date_time")
    private LocalDateTime commentCreationTime;

    @Column(name = "comment_likes_amount")
    private int commentLikesAmount;

    @Column(name = "comment_dislikes_amount")
    private int commentDislikesAmount;

}
