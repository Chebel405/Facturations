package com.Facturation.demo.Service;


import com.Facturation.demo.Entity.Entreprise;
import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Repository.EntrepriseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EntrepriseService {

    Entreprise createEntreprise(Entreprise entreprise);

    List<Entreprise> findAll();

    Optional<Entreprise> findById(Long siret);

    Entreprise save(Entreprise entreprise);

    void deleteById(Long siret);

    Entreprise updateEntreprise(Long siret, Entreprise entreprise);

}
