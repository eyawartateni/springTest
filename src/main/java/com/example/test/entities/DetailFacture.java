package com.example.test.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private String qteCommande;
    private float prixTotalDetail;
    private float pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Facture facture;
}
