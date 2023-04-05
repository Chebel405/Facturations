package com.Facturation.demo.Service;

import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Repository.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureService {

    private final FactureRepository factureRepository;

    public FactureService(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    public Facture getFactureById(Long numeroDeFacture){
        return factureRepository.findById(numeroDeFacture).orElse(null);
    }

    public Facture createFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    public Facture updateFacture(Long numeroDeFacture, Facture facture){
        Facture existeFacture = getFactureById(numeroDeFacture);
            existeFacture.setNumeroDeFacture(facture.getNumeroDeFacture());
            existeFacture.setStatut(facture.getStatut());
            existeFacture.setDateDeCreation(facture.getDateDeCreation());
            existeFacture.setDateDeModification(facture.getDateDeModification());
            existeFacture.setDatePdf(facture.getDatePdf());
            existeFacture.setDateFinalisation(facture.getDateFinalisation());
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
    public void deleteFacture(Long numeroDeFacture){
        factureRepository.deleteById(numeroDeFacture);
    }
}
