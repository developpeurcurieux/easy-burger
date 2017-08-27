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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author cdi206
 */
//TODO il faut pas oublier serialVersion sur les entites

@Entity
public class Menu implements  Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
     @ManyToMany
    @JoinTable(name = "MENU_SOUSCATEGORIE")
    private Collection<SousCategorie> sousCategories;
    
    @ManyToMany
    @JoinTable(name = "MENU_PRODUIT")
    private Collection<Produit> produits;
    
    @OneToMany(mappedBy = "menuChoix")
    private Collection<MenuSelection> menuSelections;

     public Menu() {
        this.sousCategories = new ArrayList();
        this.produits = new ArrayList<>();
        this.menuSelections = new ArrayList();
    }

    public Menu(Long id, Collection<SousCategorie> sousCategories, Collection<Produit> produits, Collection<MenuSelection> menuSelections) {
        this.id = id;
        this.sousCategories = sousCategories;
        this.produits = produits;
        this.menuSelections = menuSelections;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<SousCategorie> getSousCategories() {
        return sousCategories;
    }

    public void setSousCategories(Collection<SousCategorie> sousCategories) {
        this.sousCategories = sousCategories;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    public Collection<MenuSelection> getMenuSelections() {
        return menuSelections;
    }

    public void setMenuSelections(Collection<MenuSelection> menuSelections) {
        this.menuSelections = menuSelections;
    }

   
     

    
    
    
    
}
