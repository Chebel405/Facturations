package com.Facturation.demo.Entity;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "utilisateur")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Utilisateur {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "utilisateur_seq")
    @SequenceGenerator(name = "utilisateur_seq", sequenceName = "utilisateur_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("prenom")
    private String prenom;
    @JsonProperty("fonction")
    private String fonction;
    @JsonProperty("role")
    private String role;
    @JsonProperty("portable")
    private String portable;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("societe")
    private String societe;
    @JsonProperty("code_activite")
    private String codeActivite;
    @JsonProperty("adresse")
    private String adresse;
    @JsonProperty("code_postal")
    private String codePostal;
    @JsonProperty("ville")
    private String ville;
    @JsonProperty("note")
    private String note;



   @ManyToMany(mappedBy = "utilisateurs")
  // @JsonIgnore
   @JsonBackReference
    private List<Entreprise> entreprises;


}
