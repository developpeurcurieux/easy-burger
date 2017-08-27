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
public class Commentaire implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "FK_MENUSELECTION")
    private MenuSelection menuSelection;
    
    @ManyToOne
    @JoinColumn(name = "FK_PRODUIT")
    private Produit produit;

    public Commentaire() {
    }

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Long idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

   
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MenuSelection getMenuSelection() {
        return menuSelection;
    }

    public void setMenuSelection(MenuSelection menuSelection) {
        this.menuSelection = menuSelection;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    




}
