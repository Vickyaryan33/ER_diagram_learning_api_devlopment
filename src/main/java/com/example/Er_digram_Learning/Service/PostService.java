package com.example.Er_digram_Learning.Service;


import com.example.Er_digram_Learning.Repository.PostRepository;
import com.example.Er_digram_Learning.entity.Comment;
import com.example.Er_digram_Learning.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post) {
         return postRepository.save(post);

    }

    public void deletePost(long id) {
        postRepository.deleteById(id);
    }
}
