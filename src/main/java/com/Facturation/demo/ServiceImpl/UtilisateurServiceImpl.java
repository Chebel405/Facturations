package com.Facturation.demo.ServiceImpl;


import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Repository.UtilisateurRepository;
import com.Facturation.demo.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Optional<Utilisateur> findById(Long id) {
        return Optional.ofNullable(utilisateurRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteById(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        Optional<Utilisateur> optionalUtilisateur = utilisateurRepository.findById(id);
        if (optionalUtilisateur.isPresent()) {
            Utilisateur existeUtilisateur = optionalUtilisateur.get();
            existeUtilisateur.setNom(utilisateur.getNom());
            existeUtilisateur.setPrenom(utilisateur.getPrenom());
            existeUtilisateur.setFonction(utilisateur.getFonction());
            existeUtilisateur.setRole(utilisateur.getRole());
            existeUtilisateur.setPortable(utilisateur.getPortable());
            existeUtilisateur.setMail(utilisateur.getMail());
            existeUtilisateur.setSociete(utilisateur.getSociete());
            existeUtilisateur.setCodeActivite(utilisateur.getCodeActivite());
            existeUtilisateur.setAdresse(utilisateur.getAdresse());
            existeUtilisateur.setCodePostal(utilisateur.getCodePostal());
            existeUtilisateur.setVille(utilisateur.getVille());
            existeUtilisateur.setNote(utilisateur.getNote());
            return utilisateurRepository.save(existeUtilisateur);
        }
        return utilisateur;
    }
}






