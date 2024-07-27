package com.davidng.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "Post")
@Table(name = "tbl_posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String slug;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;
}
