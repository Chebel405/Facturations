package com.Facturation.demo.Repository;

import com.Facturation.demo.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

}
