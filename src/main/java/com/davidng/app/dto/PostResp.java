package com.davidng.app.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class PostResp {
    private Long id;
    private String title;
    private String content;
    private String slug;
    private List<CommentResp> comments;
}
