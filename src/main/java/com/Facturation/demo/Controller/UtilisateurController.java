package com.Facturation.demo.Controller;


import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/utilisateurs")
@CrossOrigin(origins = "http://localhost:4200")


public class UtilisateurController {
    //Injecte une instance de la classe UtilisationService
    //Final = permet de garantir 'limmuabilité et améliorer la sécurité
    @Autowired
    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("")
    public List<Utilisateur> findAll(){
        return utilisateurService.findAll();
    }

    @GetMapping ("/{id}")
    public Optional<Utilisateur> findById(@PathVariable Long id){
        return utilisateurService.findById(id);
    }

    @PostMapping("/")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.createUtilisateur(utilisateur);
    }

    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur){
        return utilisateurService.updateUtilisateur(id, utilisateur);
    }

    @PostMapping("")
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id){
        utilisateurService.deleteById(id);
    }

}
