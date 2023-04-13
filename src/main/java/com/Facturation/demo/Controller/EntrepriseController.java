package com.Facturation.demo.Controller;

import com.Facturation.demo.Entity.Entreprise;
import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Service.EntrepriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entreprises")
@CrossOrigin

public class EntrepriseController {


    private final EntrepriseService entrepriseService;


    public EntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @GetMapping("")
    public List<Entreprise> findAll(){
        return entrepriseService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Entreprise> findById(@PathVariable Long id){
        return entrepriseService.findById(id);
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
