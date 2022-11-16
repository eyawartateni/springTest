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
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoryProduit;
    private String codeProduit;
    private  String libelleCategorieProduit;
    @OneToMany(mappedBy = "categorieProduit")
    private Set<Produit> produitSet;

}
