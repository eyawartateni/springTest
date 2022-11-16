package com.example.test.services;

import com.example.test.entities.CategorieProduit;
import com.example.test.repository.CategoryProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryProdServiceImp implements ICategoryProduitService {
   @Autowired
    CategoryProduitRepository categoryProduitRepository;

    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categoryProduitRepository.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categoryProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        return categoryProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categoryProduitRepository.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {
        categoryProduitRepository.deleteById(id);

    }
}
