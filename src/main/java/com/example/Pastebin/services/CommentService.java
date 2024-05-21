package com.example.Pastebin.services;

import com.example.Pastebin.models.Comment;
import com.example.Pastebin.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> findAllComments() {
        return commentRepository.findAll();
    }

    public Comment getOneComment(int commentId) {
        Optional<Comment> foundComment = commentRepository.findById(commentId);
        return foundComment.orElse(null);
    }

    @Transactional
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Transactional
    public void updateComment(int commentId, Comment updatedComment) {
        updatedComment.setCommentId(commentId);
        commentRepository.save(updatedComment);
    }

    @Transactional
    public void deleteComment(int commentId) {
        commentRepository.deleteById(commentId);
    }

}
