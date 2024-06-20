package com.projet.com.security;

import com.projet.com.dto.AuthenticationRequest;
import com.projet.com.dto.AuthenticationResponse;
import com.projet.com.dto.RegisterRequest;
import com.projet.com.dao.entity.User;
import com.projet.com.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setLastname(request.getLastname());
        user.setEmail(request.getEmail());
        user.setId(request.getId());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole()); // Utilisation du nouveau constructeur

        repository.save(user);

        String jwtToken = jwtService.generateToken(UserDetails.build((user)));
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );


        var user = repository.findByUsername(request.getUsername()) // Utilisation de findByUsername
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        String jwtToken = jwtService.generateToken(UserDetails.build(user));
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

}
