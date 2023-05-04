package com.Facturation.demo.Controller;

import com.Facturation.demo.Entity.Entreprise;
import org.hibernate.Hibernate;
import com.Facturation.demo.Service.EntrepriseService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entreprises")
@CrossOrigin(origins = "http://localhost:4200")

public class EntrepriseController {

    @Autowired
    private final EntrepriseService entrepriseService;

    public EntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @GetMapping("")
    public List<Entreprise> findAll(){
        return entrepriseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entreprise> findById(@PathVariable Long id){
        Optional<Entreprise> entreprise = entrepriseService.findById(id);
        if (entreprise.isPresent()) {
            Hibernate.initialize(entreprise.get().getFactures());
            return ResponseEntity.ok().body(entreprise.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public Entreprise createEntreprise(@RequestBody Entreprise entreprise){
        return entrepriseService.createEntreprise(entreprise);
    }

    @PutMapping("/{id}")
    public Entreprise updateEntreprise(@PathVariable Long id, @RequestBody Entreprise entreprise){
        return entrepriseService.updateEntreprise(id, entreprise);
    }

    @PostMapping("")
    public Entreprise save(@RequestBody Entreprise entreprise) {
        return entrepriseService.save(entreprise);
    }
    @DeleteMapping("/{id}")
    public void deleteEntreprise(@PathVariable Long id) {
        entrepriseService.deleteById(id);
    }



}
