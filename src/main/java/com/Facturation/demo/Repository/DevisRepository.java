package com.Facturation.demo.Repository;

import com.Facturation.demo.Entity.Devis;
import com.Facturation.demo.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisRepository extends JpaRepository<Devis, Long> {

}
