
package com.projet.com.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "souhaits")
@DiscriminatorValue("Souhait")
    public class Souhait extends Transaction {
        @Column(name = "statut", nullable = false, length = 0)
        private String statut;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;}


