package com.pi.CitoyenWebService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.time.LocalDate;
@Entity
public class Citoyen {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String cin, nom , prenom ;

    private LocalDate dateNassance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
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

    public LocalDate getDateNassance() {
        return dateNassance;
    }

    public void setDateNassance(LocalDate dateNassance) {
        this.dateNassance = dateNassance;
    }
}
