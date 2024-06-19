package com.projet.com.dto;

import com.projet.com.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterRequest {
    private String username;
    private String lastname;
    private String email;
    private String password;
    private Role role;
    private Long id;
}

