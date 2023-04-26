package com.Facturation.demo.Repository;

import com.Facturation.demo.Entity.Entreprise;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//@ComponentScan
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    @Query("SELECT e FROM Entreprise e LEFT JOIN FETCH e.factures WHERE e.siret = :siret")
    Optional<Entreprise> findByIdWithFactures(@Param("siret") Long siret);



}

