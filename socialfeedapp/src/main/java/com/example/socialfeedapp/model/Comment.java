package com.example.socialfeedapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}
