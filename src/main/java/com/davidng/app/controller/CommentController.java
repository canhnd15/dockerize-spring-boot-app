package com.davidng.app.controller;

import com.davidng.app.dto.CommentCreateReq;
import com.davidng.app.dto.CommentResp;
import com.davidng.app.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/")
    public ResponseEntity<CommentResp> createComment(@RequestBody CommentCreateReq req) {
        return ResponseEntity.ok(commentService.createComment(req));
    }
}
