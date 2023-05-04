package com.Facturation.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.annotation.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "entreprise")
@Data
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
    @Fetch(FetchMode.JOIN)
    @JsonIgnore
    //@JsonManagedReference
    private List<Utilisateur> utilisateurs;


    @OneToMany(mappedBy = "entreprises", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Facture> factures;

}
