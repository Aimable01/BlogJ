package com.aimable01.blog.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CommentResponse {
    private String id;
    private String content;
    private String username;
    private LocalDateTime createdAt;
}
