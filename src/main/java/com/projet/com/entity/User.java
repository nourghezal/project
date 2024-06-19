package com.projet.com.entity;

import com.projet.com.entity.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String lastname;
    private String email;
    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Retourne les rôles de l'utilisateur sous forme de GrantedAuthority
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        // Implémentez la logique pour récupérer le mot de passe de l'utilisateur
        return null; // Remplacez null par le mot de passe réel
    }

    @Override
    public String getUsername() {
        return email; // Retourne l'email comme nom d'utilisateur
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Compte non expiré
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Compte non verrouillé
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Informations d'identification non expirées
    }

    @Override
    public boolean isEnabled() {
        return true; // Compte activé
    }


    public void setPassword(String encode) {
        // Implémentez la logique pour définir le mot de passe de l'utilisateur
    }
}
