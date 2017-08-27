/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity 
public class LigneCommande implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idLigneCommande;
    private String commantaire;
    private String type;
    private double prix;
    private double tva;
    private double remise;
    private int quantite;
    
    @ManyToOne
    @JoinColumn(name = "FK_COMMANDE")
    private Commande commande;
    
    @ManyToOne
    @JoinColumn(name = "FK_STATUT")
    private Statut statut;
    
    @ManyToOne
    @JoinColumn(name = "FK_PRODUIT")
    private Produit produit;
    
    @ManyToOne
    @JoinColumn(name = "FK_MENUSELECTION")
    private MenuSelection menuSelection;

    public LigneCommande() {
    }

    public Long getIdLigneCommande() {
        return idLigneCommande;
    }

    public void setIdLigneCommande(Long idLigneCommande) {
        this.idLigneCommande = idLigneCommande;
    }

    public String getCommantaire() {
        return commantaire;
    }

    public void setCommantaire(String commantaire) {
        this.commantaire = commantaire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public MenuSelection getMenuSelection() {
        return menuSelection;
    }

    public void setMenuSelection(MenuSelection menuSelection) {
        this.menuSelection = menuSelection;
    }

   
    
    
    
}
