/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Statut implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStatut;
    private int numero;
    private String libelle;
    
    @OneToMany(mappedBy = "statut")
    private Collection<Commande> commandes;
    
    @OneToMany(mappedBy = "statut")
    private Collection<LigneCommande> ligneCommandes;

    public Statut() {
    }

    public Long getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(Long idStatut) {
        this.idStatut = idStatut;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
    
    

}
