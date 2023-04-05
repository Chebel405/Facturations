package com.Facturation.demo.Controller;


import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Service.FactureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factures")

public class FactureController {

    private final FactureService factureService;

    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    @GetMapping("/")
    public List<Facture> getAllFactures(){
        return factureService.getAllFactures();
    }

    @GetMapping("/{id}")
    public Facture getFactureById(@PathVariable Long id){
        return factureService.getFactureById(id);
    }

    @PostMapping("/")
    public Facture createFacture(@RequestBody Facture facture) {
        return factureService.createFacture(facture);
    }

    @PutMapping("/{id}")
    public Facture updateEntreprise(@PathVariable Long id, @RequestBody Facture facture){
        return factureService.updateFacture(id, facture);
    }

    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable Long id){
        factureService.deleteFacture(id);
    }

}
