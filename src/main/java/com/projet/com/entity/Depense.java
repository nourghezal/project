package com.projet.com.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Depense")
@Table(name = "depenses")
public class Depense extends Transaction {
    @Column(name = "statut", nullable = false, length = 0)
    private String statut;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}

