package com.Facturation.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Table(name = "utilisateur")
@Data
public class Utilisateur {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String fonction;
    private String role;
    private String portable;
    private String mail;
    private String societe;
    private String codeActivite;
    private String adresse;
    private String codePostal;
    private String ville;
    private String note;

    @ManyToMany(mappedBy = "utilisateurs")
    private List<Entreprise> entreprises;



    //Constructor vide
    public Utilisateur() {
    }

    //Constructor
    @Autowired
    public Utilisateur(Long id, String nom, String prenom, String fonction, String role, String portable, String mail, String societe, String codeActivite, String adresse, String codePostal, String ville, String note) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.role = role;
        this.portable = portable;
        this.mail = mail;
        this.societe = societe;
        this.codeActivite = codeActivite;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.note = note;

    }

    //Getter et Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPortable() {
        return portable;
    }

    public void setPortable(String portable) {
        this.portable = portable;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(String codeActivite) {
        this.codeActivite = codeActivite;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Entreprise> getEntreprises() {
        return entreprises;
    }

    public void setEntreprises(List<Entreprise> entreprises) {
        this.entreprises = entreprises;
    }
}
