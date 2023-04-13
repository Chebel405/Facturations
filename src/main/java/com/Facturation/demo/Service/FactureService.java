package com.Facturation.demo.Service;

import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Repository.FactureRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public interface FactureService {


    Facture createFacture(Facture facture);


    List<Facture> findAll();

    Optional<Facture> findById(Long numeroDeFacture);

    Facture save(Facture facture);

    void deleteById(Long numeroDeFacture);

    Facture updateFacture(Long numeroDeFacture, Facture facture);
}
