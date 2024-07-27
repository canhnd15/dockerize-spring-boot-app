package com.davidng.app.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CommentCreateReq {
    private String content;
    private Long postId;
}
