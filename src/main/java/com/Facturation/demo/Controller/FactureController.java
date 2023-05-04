package com.Facturation.demo.Controller;


import com.Facturation.demo.Entity.Entreprise;
import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Service.FactureService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/factures")
@CrossOrigin(origins = "http://localhost:4200")

public class FactureController {
    @Autowired
    private final FactureService factureService;

    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    @GetMapping("")
    public List<Facture> findAll(){
        return factureService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Facture> findById(@PathVariable Long id){
        return factureService.findById(id);
    }

    @PostMapping("/")
    public Facture createFacture(@RequestBody Facture facture) {

        return factureService.createFacture(facture);
    }

    @PutMapping("/{id}")
    public Facture updateClient(@PathVariable Long id, @RequestBody Facture facture){
        return factureService.updateFacture(id, facture);
    }

    @PostMapping("")
    public Facture save(@RequestBody Facture facture) {
        return factureService.save(facture);
    }


    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable Long id){
        factureService.deleteById(id);
    }



}
