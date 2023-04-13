package com.Facturation.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.JoinColumn;


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

    @Column(name = "statut")
    private String statut;

    @Column(name = "date_de_creation")
    private Date dateDeCreation;

    @Column(name = "date_de_modification")
    private Date dateDeModification;

    @Column(name = "date_pdf")
    private Date datePdf;

    @Column(name = "date_de_finalisation")
    private Date dateDeFinalisation;

    @Column(name = "date_envoi")
    private Date dateEnvoi;

    @Column(name = "date_relance")
    private Date dateRelance;

    @Column(name = "date_paiement")
    private Date datePaiement;

    @Column(name = "emetteur_nom")
    private String emetteurNom;

    @Column(name = "emetteur_societe")
    private String emetteurSociete;

    @Column(name = "emetteur_siren")
    private String emetteurSiren;

    @Column(name = "emetteur_siret")
    private String emetteurSiret;

    @Column(name = "emetteur_code_activite")
    private String emetteurCodeActivite;

    @Column(name = "emetteur_code_ape")
    private String emetteurCodeApe;

    @Column(name = "emetteur_code_tva")
    private String emetteurCodeTva;

    @Column(name = "emetteur_adresse")
    private String emetteurAdresse;

    @Column(name = "emetteur_telephone")
    private String emetteurTelephone;

    @Column(name = "emetteur_mail")
    private String emetteurMail;

    @Column(name = "destination_nom")
    private String destinationNom;

    @Column(name = "destination_societe")
    private String destinationSociete;

    @Column(name = "destination_siren")
    private String destinationSiren;

    @Column(name = "destination_code_activite")
    private String destinationCodeActivite;

    @Column(name = "destination_code_ape")
    private String destinationCodeApe;

    @Column(name = "destination_code_tva")
    private String destinationCodeTva;

    @Column(name = "destinataire_adresse")
    private String destinataireAdresse;

    @Column(name = "destinataire_telephone")
    private String destinataireTelephone;

    @Column(name = "destinataire_mail")
    private String destinataireMail;

    @Column(name = "document_lie")
    private String documentLie;

    @Column(name = "tva_texte_default")
    private String tvaTexteDefault;

    @Column(name = "condition_de_paiement")
    private String conditionDePaiement;

    @Column(name = "mode_paiement")
    private String modeDePaiement;

    @Column(name = "interet_de_retard")
    private String interetDeRetard;

    @Column(name = "compte_bancaire")
    private String compteBancaire;

    @Column(name = "ligne_detail")
    private String ligneDetail;

    @Column(name = "tva0_texte_default")
    private String tva0TexteDefault;

    @Column(name = "interet_de_retard_texte_default")
    private String interetDeRetardTexteDefault;

    @Column(name = "assurance_pro_texte_default")
    private String assuranceProTexteDefault;
    @Column(name = "service_texte_default")
    private String servicesTexteDefault;

    // 1 facture est transmise à 1,n Entreprise
  /*  @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Entreprise> entreprises;*/

    //Ajout de la clé etrangere siret_id
    /*@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "siret_id", nullable = false)
    private Entreprise entreprises;*/

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="siret_id")
   private Entreprise entreprises;


    //Contructor vide
    //public Facture(){}


    //Constructor
    //@Autowired






    //Getter et Setter



}
