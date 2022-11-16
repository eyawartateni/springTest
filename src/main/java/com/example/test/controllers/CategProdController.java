package com.example.test.controllers;

import com.example.test.entities.CategorieProduit;
import com.example.test.services.ICategoryProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategProdController {
    @Autowired
    ICategoryProduitService iCategoryProduitService;

    @GetMapping("/GetAllCategProd")
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return iCategoryProduitService.retrieveAllCategorieProduits();
    }

   @PostMapping("/addCategProd")
    public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp) {
        return iCategoryProduitService.addCategorieProduit(cp);
    }

    @PutMapping("/updateCategProd")
    public CategorieProduit updateCategorieProduit(@RequestBody CategorieProduit cp) {
        return iCategoryProduitService.updateCategorieProduit(cp);
    }

    @GetMapping("/GetCategProd/{id}")
    public CategorieProduit retrieveCategorieProduit(@PathVariable Long id) {
return iCategoryProduitService.retrieveCategorieProduit(id);    }

    @DeleteMapping("/deleteCategProd/{id}")
    public void removeCategorieProduit(@PathVariable Long id) {
       iCategoryProduitService.removeCategorieProduit(id);

    }
}
