package com.example.Er_digram_Learning.Controller;

import com.example.Er_digram_Learning.Repository.PostRepository;
import com.example.Er_digram_Learning.Service.CommentService;
import com.example.Er_digram_Learning.Service.PostService;
import com.example.Er_digram_Learning.entity.Comment;
import com.example.Er_digram_Learning.entity.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/commnet")
public class CommnetController {
private CommentService commentService;
    private final PostRepository postRepository;

    public CommnetController(CommentService commentService,
                             PostRepository postRepository) {
        this.commentService = commentService;
        this.postRepository = postRepository;
    }
  @PostMapping
    public ResponseEntity<?> getCommnet(
            @RequestBody Comment comment,
            @RequestParam long id
    ) {

    Post post=postRepository.findById(id).get();
    comment.setPost(post);
    Comment comment1=commentService.createComment(comment);
    return  new ResponseEntity<>(comment1, HttpStatus.CREATED);
}
}
