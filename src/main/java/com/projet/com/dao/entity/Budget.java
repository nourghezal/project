package com.projet.com.dao.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "budgets")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @com.projet.com.dao.entity.Column(name = "nom", nullable = false, length = 0)
    private String nom;

    @Column(name = "montant_total", nullable = false, length = 0)
    private Double montantTotal;

    @OneToMany
    private List<Categorie> categories;
}

