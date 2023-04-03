package com.Facturation.demo.Controller;

import com.Facturation.demo.Entity.Entreprise;
import com.Facturation.demo.Service.EntrepriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entreprises")

public class EntrepriseController {


    private final EntrepriseService entrepriseService;

    public EntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @GetMapping("/")
    public List<Entreprise> getAllEntreprises(){

        return entrepriseService.getAllEntreprises();
    }

    @GetMapping("/{id}")
    public Entreprise getEntrepriseBySiret(@PathVariable Long id){
        return entrepriseService.getEntrepriseBySiret(id);
    }

    @PostMapping("/")
    public Entreprise createEntreprise(@RequestBody Entreprise entreprise){
        return entrepriseService.createEntreprise(entreprise);
    }

    @PutMapping("/{id}")
    public Entreprise updateEntreprise(@PathVariable Long id, @RequestBody Entreprise entreprise){
        return entrepriseService.updateEntreprise(id, entreprise);
    }


    @DeleteMapping("/{id}")
    public void deleteEntreprise(@PathVariable Long id) {
        entrepriseService.deleteEntreprise(id);
    }



}
