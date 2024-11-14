package com.example.Er_digram_Learning.Service;


import com.example.Er_digram_Learning.Repository.CommentRepository;
import com.example.Er_digram_Learning.entity.Comment;
import com.example.Er_digram_Learning.entity.Post;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private CommentRepository commentRepository;


    public CommentService(CommentRepository commentRepository) {

        this.commentRepository = commentRepository;
    }


    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);

    }



}
