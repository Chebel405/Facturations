package com.Facturation.demo.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
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


}
