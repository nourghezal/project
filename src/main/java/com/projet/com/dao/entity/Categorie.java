package com.projet.com.dao.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @com.projet.com.dao.entity.Column(name = "libelle", nullable = false, length = 0)
    private String libelle;
    @Column(name = "description", nullable = false, length = 0)
    private String description;
}
