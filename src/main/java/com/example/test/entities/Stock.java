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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private Integer qte;
    private Integer qteMin;
    private String libelleStock;
    @OneToMany(mappedBy = "stock")
    private Set<Produit> produits;
}
