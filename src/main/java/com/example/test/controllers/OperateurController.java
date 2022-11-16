package com.example.test.controllers;

import com.example.test.services.IOperateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperateurController {
    @Autowired
    IOperateurService iOperateurService;

    @PostMapping("/assignOperateurToFacture/{idOperateur}/{idFacture}")
    public void assignOperateurToFacture(@PathVariable Long idOperateur,@PathVariable Long idFacture) {
       iOperateurService.assignOperateurToFacture(idOperateur,idFacture);
    }


    }
