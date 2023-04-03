package com.Facturation.demo.Repository;



import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@Entity
@Table(
        name = "entreprise"
)
public class Entreprise {
    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    @Column(
            name = "siret",
            nullable = false
    )
    private Integer siret;
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
    private String codeActivité;
    private String mail;
    private String site;
    private String note;

    /*@OneToMany(mappedBy = "entreprise", fetch = FetchType.EAGER)
    private List<Utilisateur> utilisateurs*/

    public Entreprise() {
    }

    public Entreprise(Integer siret, String siren, String ape, String tva, String adresse, String codePostal, String commune, String portable, String raisonSocial, String siege, String rcs, String cfe, String codeActivité, String mail, String site, String note) {
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
        this.codeActivité = codeActivité;
        this.mail = mail;
        this.site = site;
        this.note = note;
    }

    public Integer getSiret() {
        return siret;
    }

    public void setSiret(Integer siret) {
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

    public String getCodeActivité() {
        return codeActivité;
    }

    public void setCodeActivité(String codeActivité) {
        this.codeActivité = codeActivité;
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
}
