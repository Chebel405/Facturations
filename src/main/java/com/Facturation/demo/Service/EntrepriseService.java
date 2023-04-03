package com.Facturation.demo.Service;


import com.Facturation.demo.Entity.Entreprise;
import com.Facturation.demo.Repository.EntrepriseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseService {


    private final EntrepriseRepository entrepriseRepository;

    public EntrepriseService(EntrepriseRepository entrepriseRepository){
        this.entrepriseRepository = entrepriseRepository;
    }

    public List<Entreprise> getAllEntreprises(){
        return entrepriseRepository.findAll();
    }

    public Entreprise getEntrepriseBySiret(Long siret){
        return entrepriseRepository.findBySiret(siret).orElse(null);
    }

    public Entreprise createEntreprise(Entreprise entreprise){
        return entrepriseRepository.save(entreprise);
    }

    public Entreprise updateEntreprise(Long siret, Entreprise entreprise){
        Entreprise existeEntreprise = getEntrepriseBySiret(siret);
            existeEntreprise.setSiret(entreprise.getSiret());
            existeEntreprise.setSiren(entreprise.getSiren());
            existeEntreprise.setApe(entreprise.getApe());
            existeEntreprise.setTva(entreprise.getTva());
            existeEntreprise.setAdresse(entreprise.getAdresse());
            existeEntreprise.setCodePostal(entreprise.getCodePostal());
            existeEntreprise.setCommune(entreprise.getCommune());
            existeEntreprise.setPortable(entreprise.getPortable());
            existeEntreprise.setRaisonSocial(entreprise.getRaisonSocial());
            existeEntreprise.setSiege(entreprise.getSiege());
            existeEntreprise.setRcs(entreprise.getRcs());
            existeEntreprise.setCfe(entreprise.getCfe());
            existeEntreprise.setCodeActivite(entreprise.getCodeActivite());
            existeEntreprise.setMail(entreprise.getMail());
            existeEntreprise.setSite(entreprise.getSite());
            existeEntreprise.setNote(entreprise.getNote());
            return entrepriseRepository.save(existeEntreprise);
    }
    public void deleteEntreprise(Long siret){
        entrepriseRepository.deleteBySiret(siret);
    }



}
