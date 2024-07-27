package com.davidng.app.service;

import com.davidng.app.dto.PostCreateReq;
import com.davidng.app.dto.PostResp;

import java.util.List;

public interface PostService {
    PostResp createPost(PostCreateReq req);
    List<PostResp> getAllPosts();
}
