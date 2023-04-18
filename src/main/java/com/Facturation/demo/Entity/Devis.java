package com.Facturation.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "devis")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Devis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numero_de_devis", nullable = false)
    private Long numeroDeDevis;

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

    @Column(name = "date_signature")
    private Date dateSignature;

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

    @Column(name = "destinataire_nom")
    private String destinataireNom;

    @Column(name = "destinataire_societe")
    private String destinataireSociete;

    @Column(name = "destinataire_siren")
    private String destinataireSiren;

    @Column(name = "destinataire_siret")
    private String destinataireSiret;

    @Column(name = "destinataire_code_activite")
    private String destinataireCodeActivite;

    @Column(name = "destinataire_code_ape")
    private String destinataireCodeApe;

    @Column(name = "destinataire_code_tva")
    private String destinataireCodeTva;

    @Column(name = "destinataire_adresse")
    private String destinataireAdresse;

    @Column(name = "destinataire_telephone")
    private String destinataireTelephone;

    @Column(name = "destinataire_mail")
    private String destinataireMail;

    @Column(name = "tva_texte_default")
    private String tvaTexteDefault;

    @Column(name = "condition_de_paiement")
    private String conditionDePaiement;

    @Column(name = "mode_paiement")
    private String modeDePaiement;

    @Column(name = "interet_de_retard")
    private String interetDeRetard;

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



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="siret_id")
    private Entreprise entreprises;


    //Contructor vide
    //public Facture(){}


    //Constructor
    //@Autowired






    //Getter et Setter

}
