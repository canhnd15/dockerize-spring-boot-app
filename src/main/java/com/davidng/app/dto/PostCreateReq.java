package com.davidng.app.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PostCreateReq {
    private String title;
    private String content;
    private String slug;
}
