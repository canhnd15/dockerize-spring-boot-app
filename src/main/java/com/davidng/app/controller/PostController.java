package com.davidng.app.controller;

import com.davidng.app.dto.PostCreateReq;
import com.davidng.app.dto.PostResp;
import com.davidng.app.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    @PostMapping("/")
    public ResponseEntity<PostResp> createPost(@RequestBody PostCreateReq req) {
        return ResponseEntity.ok(postService.createPost(req));
    }

    @GetMapping("/")
    public ResponseEntity<List<PostResp>> getAllPosts() {
        return ResponseEntity.ok(postService.getAllPosts());
    }
}
