package com.Facturation.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "facture")
@Data
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numero_de_facture", nullable = false)
    private Long numeroDeFacture;
    private String statut;
    private Date dateDeCreation;
    private Date dateDeModification;
    private Date datePdf;
    private Date dateFinalisation;
    private Date dateEnvoi;
    private Date dateRelance;
    private Date datePaiement;
    private String emetteurNom;
    private String emetteurSociete;
    private String emetteurSiren;
    private String emetteurSiret;
    private String emetteurCodeActivite;
    private String emetteurCodeApe;
    private String emetteurCodeTva;
    private String emetteurAdresse;
    private String emetteurTelephone;
    private String emetteurMail;
    private String destinationNom;
    private String destinationSociete;
    private String destinationSiren;
    private String destinationCodeActivite;
    private String destinationCodeApe;
    private String destinationCodeTva;
    private String destinataireAdresse;
    private String destinataireTelephone  ;
    private String destinataireMail;
    private String documentLie;
    private String tvaTexteDefault;
    private String conditionDePaiement;
    private String modeDePaiement;
    private String interetDeRetard;
    private String compteBancaire;
    private String ligneDetail;
    private String tva0TexteDefault;
    private String interetDeRetardTexteDefault;
    private String assuranceProTexteDefault;
    private String servicesTexteDefault;

    // 1 facture est transmise à 1,n Entreprise
  /*  @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Entreprise> entreprises;*/

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "siret_id", nullable = false)
    private Entreprise entreprises;



    //Contructor vide
    public Facture(){}


    //Constructor
    @Autowired
    public Facture(Long numeroDeFacture, String statut, Date dateDeCreation, Date dateDeModification, Date datePdf, Date dateFinalisation, Date dateEnvoi, Date dateRelance, Date datePaiement, String emetteurNom, String emetteurSociete, String emetteurSiren, String emetteurSiret, String emetteurCodeActivite, String emetteurCodeApe, String emetteurCodeTva, String emetteurAdresse, String emetteurTelephone, String emetteurMail, String destinationNom, String destinationSociete, String destinationSiren, String destinationCodeActivite, String destinationCodeApe, String destinationCodeTva, String destinataireAdresse, String destinataireTelephone, String destinataireMail, String documentLie, String tvaTexteDefault, String conditionDePaiement, String modeDePaiement, String interetDeRetard, String compteBancaire, String ligneDetail, String tva0TexteDefault, String interetDeRetardTexteDefault, String assuranceProTexteDefault, String servicesTexteDefault, Entreprise entreprises) {
        this.numeroDeFacture = numeroDeFacture;
        this.statut = statut;
        this.dateDeCreation = dateDeCreation;
        this.dateDeModification = dateDeModification;
        this.datePdf = datePdf;
        this.dateFinalisation = dateFinalisation;
        this.dateEnvoi = dateEnvoi;
        this.dateRelance = dateRelance;
        this.datePaiement = datePaiement;
        this.emetteurNom = emetteurNom;
        this.emetteurSociete = emetteurSociete;
        this.emetteurSiren = emetteurSiren;
        this.emetteurSiret = emetteurSiret;
        this.emetteurCodeActivite = emetteurCodeActivite;
        this.emetteurCodeApe = emetteurCodeApe;
        this.emetteurCodeTva = emetteurCodeTva;
        this.emetteurAdresse = emetteurAdresse;
        this.emetteurTelephone = emetteurTelephone;
        this.emetteurMail = emetteurMail;
        this.destinationNom = destinationNom;
        this.destinationSociete = destinationSociete;
        this.destinationSiren = destinationSiren;
        this.destinationCodeActivite = destinationCodeActivite;
        this.destinationCodeApe = destinationCodeApe;
        this.destinationCodeTva = destinationCodeTva;
        this.destinataireAdresse = destinataireAdresse;
        this.destinataireTelephone = destinataireTelephone;
        this.destinataireMail = destinataireMail;
        this.documentLie = documentLie;
        this.tvaTexteDefault = tvaTexteDefault;
        this.conditionDePaiement = conditionDePaiement;
        this.modeDePaiement = modeDePaiement;
        this.interetDeRetard = interetDeRetard;
        this.compteBancaire = compteBancaire;
        this.ligneDetail = ligneDetail;
        this.tva0TexteDefault = tva0TexteDefault;
        this.interetDeRetardTexteDefault = interetDeRetardTexteDefault;
        this.assuranceProTexteDefault = assuranceProTexteDefault;
        this.servicesTexteDefault = servicesTexteDefault;
        this.entreprises = entreprises;
    }





    //Getter et Setter


    public Long getNumeroDeFacture() {
        return numeroDeFacture;
    }

    public void setNumeroDeFacture(Long numeroDeFacture) {
        this.numeroDeFacture = numeroDeFacture;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public Date getDateDeModification() {
        return dateDeModification;
    }

    public void setDateDeModification(Date dateDeModification) {
        this.dateDeModification = dateDeModification;
    }

    public Date getDatePdf() {
        return datePdf;
    }

    public void setDatePdf(Date datePdf) {
        this.datePdf = datePdf;
    }

    public Date getDateFinalisation() {
        return dateFinalisation;
    }

    public void setDateFinalisation(Date dateFinalisation) {
        this.dateFinalisation = dateFinalisation;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Date getDateRelance() {
        return dateRelance;
    }

    public void setDateRelance(Date dateRelance) {
        this.dateRelance = dateRelance;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getEmetteurNom() {
        return emetteurNom;
    }

    public void setEmetteurNom(String emetteurNom) {
        this.emetteurNom = emetteurNom;
    }

    public String getEmetteurSociete() {
        return emetteurSociete;
    }

    public void setEmetteurSociete(String emetteurSociete) {
        this.emetteurSociete = emetteurSociete;
    }

    public String getEmetteurSiren() {
        return emetteurSiren;
    }

    public void setEmetteurSiren(String emetteurSiren) {
        this.emetteurSiren = emetteurSiren;
    }

    public String getEmetteurSiret() {
        return emetteurSiret;
    }

    public void setEmetteurSiret(String emetteurSiret) {
        this.emetteurSiret = emetteurSiret;
    }

    public String getEmetteurCodeActivite() {
        return emetteurCodeActivite;
    }

    public void setEmetteurCodeActivite(String emetteurCodeActivite) {
        this.emetteurCodeActivite = emetteurCodeActivite;
    }

    public String getEmetteurCodeApe() {
        return emetteurCodeApe;
    }

    public void setEmetteurCodeApe(String emetteurCodeApe) {
        this.emetteurCodeApe = emetteurCodeApe;
    }

    public String getEmetteurCodeTva() {
        return emetteurCodeTva;
    }

    public void setEmetteurCodeTva(String emetteurCodeTva) {
        this.emetteurCodeTva = emetteurCodeTva;
    }

    public String getEmetteurAdresse() {
        return emetteurAdresse;
    }

    public void setEmetteurAdresse(String emetteurAdresse) {
        this.emetteurAdresse = emetteurAdresse;
    }

    public String getEmetteurTelephone() {
        return emetteurTelephone;
    }

    public void setEmetteurTelephone(String emetteurTelephone) {
        this.emetteurTelephone = emetteurTelephone;
    }

    public String getEmetteurMail() {
        return emetteurMail;
    }

    public void setEmetteurMail(String emetteurMail) {
        this.emetteurMail = emetteurMail;
    }

    public String getDestinationNom() {
        return destinationNom;
    }

    public void setDestinationNom(String destinationNom) {
        this.destinationNom = destinationNom;
    }

    public String getDestinationSociete() {
        return destinationSociete;
    }

    public void setDestinationSociete(String destinationSociete) {
        this.destinationSociete = destinationSociete;
    }

    public String getDestinationSiren() {
        return destinationSiren;
    }

    public void setDestinationSiren(String destinationSiren) {
        this.destinationSiren = destinationSiren;
    }

    public String getDestinationCodeActivite() {
        return destinationCodeActivite;
    }

    public void setDestinationCodeActivite(String destinationCodeActivite) {
        this.destinationCodeActivite = destinationCodeActivite;
    }

    public String getDestinationCodeApe() {
        return destinationCodeApe;
    }

    public void setDestinationCodeApe(String destinationCodeApe) {
        this.destinationCodeApe = destinationCodeApe;
    }

    public String getDestinationCodeTva() {
        return destinationCodeTva;
    }

    public void setDestinationCodeTva(String destinationCodeTva) {
        this.destinationCodeTva = destinationCodeTva;
    }

    public String getDestinataireAdresse() {
        return destinataireAdresse;
    }

    public void setDestinataireAdresse(String destinataireAdresse) {
        this.destinataireAdresse = destinataireAdresse;
    }

    public String getDestinataireTelephone() {
        return destinataireTelephone;
    }

    public void setDestinataireTelephone(String destinataireTelephone) {
        this.destinataireTelephone = destinataireTelephone;
    }

    public String getDestinataireMail() {
        return destinataireMail;
    }

    public void setDestinataireMail(String destinataireMail) {
        this.destinataireMail = destinataireMail;
    }

    public String getDocumentLie() {
        return documentLie;
    }

    public void setDocumentLie(String documentLie) {
        this.documentLie = documentLie;
    }

    public String getTvaTexteDefault() {
        return tvaTexteDefault;
    }

    public void setTvaTexteDefault(String tvaTexteDefault) {
        this.tvaTexteDefault = tvaTexteDefault;
    }

    public String getConditionDePaiement() {
        return conditionDePaiement;
    }

    public void setConditionDePaiement(String conditionDePaiement) {
        this.conditionDePaiement = conditionDePaiement;
    }

    public String getModeDePaiement() {
        return modeDePaiement;
    }

    public void setModeDePaiement(String modeDePaiement) {
        this.modeDePaiement = modeDePaiement;
    }

    public String getInteretDeRetard() {
        return interetDeRetard;
    }

    public void setInteretDeRetard(String interetDeRetard) {
        this.interetDeRetard = interetDeRetard;
    }

    public String getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(String compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

    public String getLigneDetail() {
        return ligneDetail;
    }

    public void setLigneDetail(String ligneDetail) {
        this.ligneDetail = ligneDetail;
    }

    public String getTva0TexteDefault() {
        return tva0TexteDefault;
    }

    public void setTva0TexteDefault(String tva0TexteDefault) {
        this.tva0TexteDefault = tva0TexteDefault;
    }

    public String getInteretDeRetardTexteDefault() {
        return interetDeRetardTexteDefault;
    }

    public void setInteretDeRetardTexteDefault(String interetDeRetardTexteDefault) {
        this.interetDeRetardTexteDefault = interetDeRetardTexteDefault;
    }

    public String getAssuranceProTexteDefault() {
        return assuranceProTexteDefault;
    }

    public void setAssuranceProTexteDefault(String assuranceProTexteDefault) {
        this.assuranceProTexteDefault = assuranceProTexteDefault;
    }

    public String getServicesTexteDefault() {
        return servicesTexteDefault;
    }

    public void setServicesTexteDefault(String servicesTexteDefault) {
        this.servicesTexteDefault = servicesTexteDefault;
    }

    public Entreprise getEntreprises() {
        return entreprises;
    }

    public void setEntreprises(Entreprise entreprises) {
        this.entreprises = entreprises;
    }
}
