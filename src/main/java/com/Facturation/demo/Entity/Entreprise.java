package com.Facturation.demo.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(name = "entreprise")
@Data
public class Entreprise {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "siret", nullable = false)
    @Id
    private Long siret;
    private String siren;
    private String ape;
    private String tva;
    private String adresse;
    private String codePostal;
    private String commune;
    private String portable;
    private String raisonSocial;
    private String siege;
    private String rcs;
    private String cfe;
    private String codeActivite;
    private String mail;
    private String site;
    private String note;

    /* JE RELIE LA TABLE UTILISATEUR A LA TABLE ENTREPRISE */

    @ManyToMany
    @JoinTable(
            name = "entreprise_utilisateur",
            joinColumns = @JoinColumn(name = "entreprise_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")

    )

    private List<Utilisateur> utilisateurs;

    /*@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "facture_id", nullable = false)
    private Facture factures;*/

    @OneToMany
    private List<Facture> factures;

    //Constructor vide
    public Entreprise() {
    }

    //Constructor
    @Autowired
    public Entreprise(Long siret, String siren, String ape, String tva, String adresse, String codePostal, String commune, String portable, String raisonSocial, String siege, String rcs, String cfe, String codeActivite, String mail, String site, String note) {
        this.siret = siret;
        this.siren = siren;
        this.ape = ape;
        this.tva = tva;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.commune = commune;
        this.portable = portable;
        this.raisonSocial = raisonSocial;
        this.siege = siege;
        this.rcs = rcs;
        this.cfe = cfe;
        this.codeActivite = codeActivite;
        this.mail = mail;
        this.site = site;
        this.note = note;
        /**/
    }

    // Getter et Setter
    public Long getSiret() {
        return siret;
    }

    public void setSiret(Long siret) {
        this.siret = siret;
    }

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getTva() {
        return tva;
    }

    public void setTva(String tva) {
        this.tva = tva;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getPortable() {
        return portable;
    }

    public void setPortable(String portable) {
        this.portable = portable;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getRcs() {
        return rcs;
    }

    public void setRcs(String rcs) {
        this.rcs = rcs;
    }

    public String getCfe() {
        return cfe;
    }

    public void setCfe(String cfe) {
        this.cfe = cfe;
    }

    public String getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(String codeActivite) {
        this.codeActivite = codeActivite;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
