package com.Facturation.demo.Repository;


import com.Facturation.demo.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

   /* List<Utilisateur> findAll();

    @Override
    Optional<Utilisateur> findById(Long id);

    Utilisateur save(Utilisateur utilisateur);

    void deleteById(Long id);*/




}

