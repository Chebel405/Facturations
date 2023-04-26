package com.Facturation.demo.ServiceImpl;

import com.Facturation.demo.Entity.Devis;
import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Repository.DevisRepository;
import com.Facturation.demo.Service.DevisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DevisServiceImpl implements DevisService {

    // L'objet créé ne peut pas être modifier
    private final DevisRepository devisRepository;

    @Autowired
    public DevisServiceImpl(DevisRepository devisRepository) {
        this.devisRepository = devisRepository;
    }

    @Override
    public Devis createDevis(Devis devis) {
        return devisRepository.save(devis);
    }

    @Override
    public List<Devis> findAll() {
        return devisRepository.findAll();
    }

    @Override
    public Optional<Devis> findById(Long numeroDeDevis) {
        return Optional.ofNullable(devisRepository.findById(numeroDeDevis).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @Override
    public Devis save(Devis devis) {
        return devisRepository.save(devis);
    }

    @Override
    public void deleteById(Long numeroDeDevis) {
        devisRepository.deleteById(numeroDeDevis);
    }

    @Override
    public Devis updateDevis(@PathVariable Long numeroDeDevis, @RequestBody Devis devis) {
        Optional<Devis> optionalDevis = devisRepository.findById(numeroDeDevis);
        if (optionalDevis.isPresent()) {
            Devis existeDevis = optionalDevis.get();
            existeDevis.setStatut(devis.getStatut());
            existeDevis.setDateDeCreation(devis.getDateDeCreation());
            existeDevis.setDateDeModification(devis.getDateDeModification());
            existeDevis.setDatePdf(devis.getDatePdf());
            existeDevis.setDateDeFinalisation(devis.getDateDeFinalisation());
            existeDevis.setDateEnvoi(devis.getDateEnvoi());
            existeDevis.setDateRelance(devis.getDateRelance());
            existeDevis.setDateSignature(devis.getDateSignature());
            existeDevis.setEmetteurNom(devis.getEmetteurNom());
            existeDevis.setEmetteurSociete(devis.getEmetteurSociete());
            existeDevis.setEmetteurSiren(devis.getEmetteurSiren());
            existeDevis.setEmetteurSiret(devis.getEmetteurSiret());
            existeDevis.setEmetteurCodeActivite(devis.getEmetteurCodeActivite());
            existeDevis.setEmetteurCodeApe(devis.getEmetteurCodeApe());
            existeDevis.setEmetteurCodeTva(devis.getEmetteurCodeTva());
            existeDevis.setEmetteurAdresse(devis.getEmetteurAdresse());
            existeDevis.setEmetteurTelephone(devis.getEmetteurTelephone());
            existeDevis.setEmetteurMail(devis.getEmetteurMail());
            existeDevis.setDestinataireNom(devis.getDestinataireNom());
            existeDevis.setDestinataireSociete(devis.getDestinataireSociete());
            existeDevis.setDestinataireSiren(devis.getDestinataireSiren());
            existeDevis.setDestinataireCodeActivite(devis.getDestinataireCodeActivite());
            existeDevis.setDestinataireCodeApe(devis.getDestinataireCodeApe());
            existeDevis.setDestinataireCodeTva(devis.getDestinataireCodeTva());
            existeDevis.setDestinataireAdresse(devis.getDestinataireAdresse());
            existeDevis.setDestinataireTelephone(devis.getDestinataireTelephone());
            existeDevis.setDestinataireMail(devis.getDestinataireMail());
            existeDevis.setTvaTexteDefault(devis.getTvaTexteDefault());
            existeDevis.setConditionDePaiement(devis.getConditionDePaiement());
            existeDevis.setModeDePaiement(devis.getModeDePaiement());
            existeDevis.setInteretDeRetard(devis.getInteretDeRetard());
            existeDevis.setLigneDetail(devis.getLigneDetail());
            existeDevis.setTva0TexteDefault(devis.getTva0TexteDefault());
            existeDevis.setInteretDeRetardTexteDefault(devis.getInteretDeRetardTexteDefault());
            existeDevis.setAssuranceProTexteDefault(devis.getAssuranceProTexteDefault());
            existeDevis.setServicesTexteDefault(devis.getServicesTexteDefault());
            return devisRepository.save(existeDevis);
        }
        return devis;
    }

}
