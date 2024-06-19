
package com.projet.com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Builder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {
    private String email;
    private String password;

}

