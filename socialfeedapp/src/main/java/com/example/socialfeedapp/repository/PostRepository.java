package com.example.socialfeedapp.repository;

import com.example.socialfeedapp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();  // Infinite Scroll
}

