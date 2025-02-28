package com.example.socialfeedapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String content;
    private String mediaUrl;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}

