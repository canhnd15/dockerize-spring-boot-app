package com.davidng.app.service;

import com.davidng.app.dto.CommentCreateReq;
import com.davidng.app.dto.CommentResp;

public interface CommentService {
    CommentResp createComment(CommentCreateReq req);
}
