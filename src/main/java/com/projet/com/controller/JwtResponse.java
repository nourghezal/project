package com.projet.com.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {
    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }
}

