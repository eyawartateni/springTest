package com.example.test.services;

import com.example.test.entities.CategorieProduit;
import com.example.test.repository.CategoryProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ICategoryProduitService {
    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit(CategorieProduit cp);

    CategorieProduit updateCategorieProduit(CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit(Long id);

    void removeCategorieProduit(Long id);
}
