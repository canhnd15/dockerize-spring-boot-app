package com.davidng.app.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CommentResp {
    private Long id;
    private String content;
    private Long postId;
}
