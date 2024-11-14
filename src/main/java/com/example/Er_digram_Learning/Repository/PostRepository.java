package com.example.Er_digram_Learning.Repository;

import com.example.Er_digram_Learning.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}