package com.example.test.services;


import com.example.test.entities.Fourniisseur;
import com.example.test.entities.SecteurActivite;
import com.example.test.repository.FournisseurRepository;
import com.example.test.repository.SecteurActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FournisseurServiceImp implements IFournisseurService{
@Autowired
    FournisseurRepository fournisseurRepository;
@Autowired
    SecteurActiviteRepository secteurActiviteRepository;

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fourniisseur fourniisseur=fournisseurRepository.findById(fournisseurId).orElse(null);
        SecteurActivite secteurActivite=secteurActiviteRepository.findById(secteurActiviteId).orElse(null);
        Set<SecteurActivite> sec = new HashSet<>();
        Set<Fourniisseur> four = new HashSet<>();
        if(fourniisseur!=null && secteurActivite!=null)
        {
            four.add(fourniisseur);

            sec.add(secteurActivite);
            fourniisseur.setSecteurActiviteSet(sec);
            secteurActivite.setFourniisseurSet(four);
            fournisseurRepository.save(fourniisseur);

        }
    }
}
