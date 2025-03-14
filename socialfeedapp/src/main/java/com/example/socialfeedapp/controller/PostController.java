package com.example.socialfeedapp.controller;

import com.example.socialfeedapp.model.Post;
import com.example.socialfeedapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @GetMapping
    public List<Post> getPosts() {
        return postRepository.findAllByOrderByCreatedAtDesc();
    }
}
