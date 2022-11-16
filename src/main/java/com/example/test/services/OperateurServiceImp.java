package com.example.test.services;

import com.example.test.entities.Facture;
import com.example.test.entities.Operateur;
import com.example.test.repository.FactureRepository;
import com.example.test.repository.OperateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OperateurServiceImp implements IOperateurService{

    @Autowired
    OperateurRepository operateurRepository;
    @Autowired
    FactureRepository factureRepository;

    @Override
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur operateur=operateurRepository.findById(idOperateur).orElse(null);
        Facture facture=factureRepository.findById(idFacture).orElse(null);

        Set<Facture> fac = new HashSet<>();
        if(operateur!=null && facture!=null)
        {
            fac.add(facture);

            operateur.setFactureSet(fac);
            operateurRepository.save(operateur);

        }
    }

}
