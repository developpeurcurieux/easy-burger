/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author testo
 */
@Entity
public class Employe implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    private String nom;
    private String prenom;
    private int mdp;
    
    @ManyToMany(mappedBy = "employes")
    private Collection<Poste> postes;
    
    public Employe() {
        this.postes = new ArrayList();
    }
    
    public Employe(String nom, String prenom, int mdp) {
        this();
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
    }

    public Employe(String nom, String prenom, int mdp, Collection<Poste> postes) {
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.postes = postes;
    }

    public Long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
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

    public int getMdp() {
        return mdp;
    }

    public void setMdp(int mdp) {
        this.mdp = mdp;
    }

    public Collection<Poste> getPostes() {
        return postes;
    }

    public void setPostes(Collection<Poste> postes) {
        this.postes = postes;
    }
    
    
    
    
    
}
