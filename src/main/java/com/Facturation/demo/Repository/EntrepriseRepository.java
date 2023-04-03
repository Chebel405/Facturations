package com.Facturation.demo.Repository;

import com.Facturation.demo.Entity.Entreprise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

    List<Entreprise> findAll();

    Optional<Entreprise> findBySiret(Long siret);

    Entreprise save(Entreprise entreprise);

    void deleteBySiret(Long siret);


}
