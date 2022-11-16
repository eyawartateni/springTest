package com.example.test.repository;

import com.example.test.entities.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryProduitRepository extends JpaRepository<CategorieProduit,Long> {
}
