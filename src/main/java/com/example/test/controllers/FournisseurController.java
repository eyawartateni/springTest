package com.example.test.controllers;

import com.example.test.services.IFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FournisseurController {
@Autowired
    IFournisseurService iFournisseurService;

@PostMapping("/assignSecteurActiviteToFournisseur/{fournisseurId}/{secteurActiviteId}")
    public void assignSecteurActiviteToFournisseur(@PathVariable Long fournisseurId,@PathVariable Long secteurActiviteId) {
        iFournisseurService.assignSecteurActiviteToFournisseur(fournisseurId,secteurActiviteId);
    }

    }
