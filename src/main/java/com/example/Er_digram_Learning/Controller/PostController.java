package com.example.Er_digram_Learning.Controller;

import com.example.Er_digram_Learning.Service.PostService;
import com.example.Er_digram_Learning.entity.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
   private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/create")
    public ResponseEntity<Post> createPost(
            @RequestBody Post post
            ) {
        Post p1 = postService.createPost(post);
        return  new ResponseEntity<>(p1, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public String DeletePost( @PathVariable long id){
        postService.deletePost(id);
        return "Post deleted successfully";

    }

}
