package com.Facturation.demo.ServiceImpl;

import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Entity.Utilisateur;
import com.Facturation.demo.Repository.FactureRepository;
import com.Facturation.demo.Service.FactureService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class FactureServiceImpl implements FactureService {

    private final FactureRepository factureRepository;

    public FactureServiceImpl(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    @Override
    public Facture createFacture(Facture facture) {
        return factureRepository.save(facture);

    }

    @Override
    public List<Facture> findAll() {
        return factureRepository.findAll();
    }

    @Override
    public Optional<Facture> findById(Long numeroDeFacture) {
        return Optional.ofNullable(factureRepository.findById(numeroDeFacture).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @Override
    public Facture save(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public void deleteById(Long numeroDeFacture) {
        factureRepository.deleteById(numeroDeFacture);
    }

    @Override
    public Facture updateFacture(@PathVariable Long numeroDeFacture, @RequestBody Facture facture) {
        Optional<Facture> optionalFacture = factureRepository.findById(numeroDeFacture);
        if (optionalFacture.isPresent()) {
            Facture existeFacture = optionalFacture.get();
            existeFacture.setStatut(facture.getStatut());
            existeFacture.setDateDeCreation(facture.getDateDeCreation());
            existeFacture.setDateDeModification(facture.getDateDeModification());
            existeFacture.setDatePdf(facture.getDatePdf());
            existeFacture.setDateDeFinalisation(facture.getDateDeFinalisation());
            existeFacture.setDateEnvoi(facture.getDateEnvoi());
            existeFacture.setDateRelance(facture.getDateRelance());
            existeFacture.setDatePaiement(facture.getDatePaiement());
            existeFacture.setEmetteurNom(facture.getEmetteurNom());
            existeFacture.setEmetteurSociete(facture.getEmetteurSociete());
            existeFacture.setEmetteurSiren(facture.getEmetteurSiren());
            existeFacture.setEmetteurSiret(facture.getEmetteurSiret());
            existeFacture.setEmetteurCodeActivite(facture.getEmetteurCodeActivite());
            existeFacture.setEmetteurCodeApe(facture.getEmetteurCodeApe());
            existeFacture.setEmetteurCodeTva(facture.getEmetteurCodeTva());
            existeFacture.setEmetteurAdresse(facture.getEmetteurAdresse());
            existeFacture.setEmetteurTelephone(facture.getEmetteurTelephone());
            existeFacture.setEmetteurMail(facture.getEmetteurMail());
            existeFacture.setDestinationNom(facture.getDestinationNom());
            existeFacture.setDestinationSociete(facture.getDestinationSociete());
            existeFacture.setDestinationSiren(facture.getDestinationSiren());
            existeFacture.setDestinationCodeActivite(facture.getDestinationCodeActivite());
            existeFacture.setDestinationCodeApe(facture.getDestinationCodeApe());
            existeFacture.setDestinationCodeTva(facture.getDestinationCodeTva());
            existeFacture.setDestinataireAdresse(facture.getDestinataireAdresse());
            existeFacture.setDestinataireTelephone(facture.getDestinataireTelephone());
            existeFacture.setDestinataireMail(facture.getDestinataireMail());
            existeFacture.setDocumentLie(facture.getDocumentLie());
            existeFacture.setTvaTexteDefault(facture.getTvaTexteDefault());
            existeFacture.setConditionDePaiement(facture.getConditionDePaiement());
            existeFacture.setModeDePaiement(facture.getModeDePaiement());
            existeFacture.setInteretDeRetard(facture.getInteretDeRetard());
            existeFacture.setCompteBancaire(facture.getCompteBancaire());
            existeFacture.setLigneDetail(facture.getLigneDetail());
            existeFacture.setTva0TexteDefault(facture.getTva0TexteDefault());
            existeFacture.setInteretDeRetardTexteDefault(facture.getInteretDeRetardTexteDefault());
            existeFacture.setAssuranceProTexteDefault(facture.getAssuranceProTexteDefault());
            existeFacture.setServicesTexteDefault(facture.getServicesTexteDefault());
            return factureRepository.save(existeFacture);
        }
        return facture;
    }
}
