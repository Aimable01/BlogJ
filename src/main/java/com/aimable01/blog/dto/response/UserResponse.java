package com.aimable01.blog.dto.response;

import com.aimable01.blog.enums.Role;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserResponse {
    private String id;
    private String username;
    private String email;
    private Role role;
    private LocalDateTime createdAt;
}
