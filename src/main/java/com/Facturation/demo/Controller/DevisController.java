package com.Facturation.demo.Controller;

import com.Facturation.demo.Entity.Devis;
import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Service.DevisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devis")
@CrossOrigin(origins = "http://localhost:4200")
public class DevisController {

    @Autowired
    private final DevisService devisService;

    public DevisController(DevisService devisService) {
        this.devisService = devisService;
    }

    @GetMapping("")
    public List<Devis> findAll(){
        return devisService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Devis> findById(@PathVariable Long id){
        return devisService.findById(id);
    }

    @PostMapping("/")
    public Devis createDevis(@RequestBody Devis devis) {
        return devisService.createDevis(devis);
    }

    @PutMapping("/{id}")
    public Devis updateDevis(@PathVariable Long id, @RequestBody Devis devis){
        return devisService.updateDevis(id, devis);
    }

    @PostMapping("")
    public Devis save(@RequestBody Devis devis) {
        return devisService.save(devis);
    }


    @DeleteMapping("/{id}")
    public void deleteDevis(@PathVariable Long id){
        devisService.deleteById(id);
    }
}
