package com.example.test.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    private boolean archive;
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactureSet;
    @OneToMany(mappedBy = "facture")
    private Set<Reglement> reglements;
    @ManyToOne
    private Fourniisseur fourniisseur;

}
