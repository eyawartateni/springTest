package com.example.test.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fourniisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    @ManyToMany(mappedBy = "fourniisseurSet")
    private Set<SecteurActivite> secteurActiviteSet;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;
    @OneToOne(mappedBy = "fourniisseur")
    private DetailFournisseur detailFournisseur;
    @OneToMany(mappedBy = "fourniisseur")
    private Set<Facture> factureSet;



}
