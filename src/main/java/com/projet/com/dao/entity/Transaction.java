package com.projet.com.dao.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
    public abstract class Transaction {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @com.projet.com.dao.entity.Column(name = "montant", nullable = false, length = 0)
        private Double montant;

        @com.projet.com.dao.entity.Column(name = "date_operation", nullable = false, length = 0)
        private Date dateOperation;
       @Column(name = "description", nullable = false, length = 0)
    private String description ;


    }


