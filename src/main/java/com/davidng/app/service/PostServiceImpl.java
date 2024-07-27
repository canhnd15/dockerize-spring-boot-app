package com.davidng.app.service;

import com.davidng.app.dto.CommentResp;
import com.davidng.app.dto.PostCreateReq;
import com.davidng.app.dto.PostResp;
import com.davidng.app.entity.Post;
import com.davidng.app.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public PostResp createPost(PostCreateReq req) {
        Post post = new Post();
        post.setTitle(req.getTitle());
        post.setContent(req.getContent());
        post.setSlug(req.getSlug());

        post = postRepository.save(post);

        return PostResp.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .slug(post.getSlug())
                .build();
    }

    @Override
    public List<PostResp> getAllPosts() {
        List<Post> posts = postRepository.findAll();

        List<PostResp> results = new ArrayList<>();

        if (!posts.isEmpty()) {
            results = posts.stream().map(post -> PostResp.builder()
                    .id(post.getId())
                    .title(post.getTitle())
                    .content(post.getContent())
                    .slug(post.getSlug())
                    .comments(!post.getComments().isEmpty() ? post.getComments().stream()
                            .map(comment -> CommentResp.builder()
                                    .id(comment.getId())
                                    .content(comment.getContent())
                                    .build()).collect(Collectors.toList()) : null)
                    .build()).collect(Collectors.toList());
        }
        return results;
    }
}
