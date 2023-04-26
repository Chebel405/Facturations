package com.Facturation.demo.Service;


import com.Facturation.demo.Entity.Entreprise;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
@ComponentScan

public interface EntrepriseService {

    Entreprise createEntreprise(Entreprise entreprise);

    List<Entreprise> findAll();

    Optional<Entreprise> findById(Long siret);

    Entreprise save(Entreprise entreprise);

    void deleteById(Long siret);

    Entreprise updateEntreprise(Long siret, Entreprise entreprise);

    Optional<Entreprise> findByIdWithFactures(Long siret);




}
