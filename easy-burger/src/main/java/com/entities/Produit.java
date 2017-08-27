/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity 
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String reference;
    private String nom;
    private String description;
    private int stock;
    private double prixHT;
    
    @OneToMany(mappedBy="produit")
    private Collection<LigneCommande> ligneCommandes;
    
    @ManyToOne
    @JoinColumn(name = "FK_TVA")
    private Tva tva;
    
    @ManyToMany(mappedBy = "produits")
    private Collection<Promotion> promotions;
    
    @ManyToMany
    @JoinTable(name = "INGREDIENT_PRODUIT")
    private Collection<Ingredient> ingredients;
    
    @ManyToOne
    @JoinColumn(name = "FK_SOUSCATEGORIE")
    private SousCategorie sousCategorie;
    
    @ManyToMany(mappedBy = "produits")
    private Collection<Menu> menus;
    
    @OneToMany(mappedBy = "produit")
    private Collection<Commentaire> commentaires;

    public Produit() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    

   
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Tva getTva() {
        return tva;
    }

    public void setTva(Tva tva) {
        this.tva = tva;
    }

    public Collection<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(Collection<Promotion> promotions) {
        this.promotions = promotions;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public SousCategorie getSousCategorie() {
        return sousCategorie;
    }

    public void setSousCategorie(SousCategorie sousCategorie) {
        this.sousCategorie = sousCategorie;
    }

    public Collection<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Collection<Menu> menus) {
        this.menus = menus;
    }

    public Collection<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Collection<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }
    
    
    
    
    
    
    
}
