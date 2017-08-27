/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Menu {
      private static final long serialVersionUID = 1L;
      
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long idMenu;
      
      @ManyToMany
      @JoinTable(name="MENU_SOUSCATEGORIE")
      private Collection<SousCategorie> sousCategories;
      
      @ManyToMany
      @JoinTable(name = "MENU_PRODUIT")
      private Collection<Produit> produits;
      
      @OneToMany(mappedBy = "menu")
      private Collection<MenuSelection> menuSelections;

    public Menu() {
    }

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
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
