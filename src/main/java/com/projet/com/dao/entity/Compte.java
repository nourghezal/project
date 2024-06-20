package com.projet.com.dao.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@Table(name = "comptes")
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @com.projet.com.dao.entity.Column(name = "solde", nullable = false, length = 0)
        private Double solde;

        @Column(name = "RIB", nullable = false, length = 0)
        private String RIB;


    }


