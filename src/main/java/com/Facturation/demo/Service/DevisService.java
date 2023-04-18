package com.Facturation.demo.Service;

import com.Facturation.demo.Entity.Devis;
import com.Facturation.demo.Entity.Facture;

import java.util.List;
import java.util.Optional;

public interface DevisService {

    Devis createDevis(Devis devis);


    List<Devis> findAll();

    Optional<Devis> findById(Long numeroDeDevis);

    Devis save(Devis devis);

    void deleteById(Long numeroDeDevis);

    Devis updateDevis(Long numeroDeDevis, Devis devis);
}
