package com.Facturation.demo.Service;


import com.Facturation.demo.Entity.Utilisateur;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;

//@Service
@ComponentScan
public interface UtilisateurService {
    Utilisateur createUtilisateur(Utilisateur utilisateur);

    List<Utilisateur> findAll();

    Optional<Utilisateur> findById(Long id);

    Utilisateur save(Utilisateur utilisateur);

    void deleteById(Long id);

    Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur);
}
































/*import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Repository.UtilisateurRepository;
import org.springframework.stereotype.Service;
import java.util.List;



@Service


public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur getUtilisateurById(Long id){
        return utilisateurRepository.findById(id).orElse(null);
    }
    public Utilisateur createUtilisateur(Utilisateur utilisateur){
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur){
        Utilisateur existeUtilisateur = getUtilisateurById(id);
            existeUtilisateur.setId(utilisateur.getId());
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

    public void deleteUtilisateur(Long id){
        utilisateurRepository.deleteById(id);
    }

}
*/

