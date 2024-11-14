package com.example.Er_digram_Learning.Repository;

import com.example.Er_digram_Learning.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}