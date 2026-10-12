package com.pawhaven.dto;

import com.pawhaven.model.AppUser;
import com.pawhaven.model.Role;
import java.time.LocalDateTime;

public record AdminUserResponse(Long id, String name, String email, Role role, LocalDateTime createdAt) {
    public static AdminUserResponse from(AppUser user) {
        return new AdminUserResponse(user.getId(), user.getName(), user.getEmail(), user.getRole(), user.getCreatedAt());
    }
}
