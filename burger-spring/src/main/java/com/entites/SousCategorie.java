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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SousCategorie implements  Serializable {
    @Id
    private String idSousCategorie;
    
    
    @ManyToOne
    @JoinColumn(name = "FK_CATEGORIE")
    private Categorie categorie;
    
    @OneToMany(mappedBy = "sousCategorie")
    private Collection<Produit> produits;
    
    @ManyToMany(mappedBy = "sousCategories")
    private Collection<Menu> menus;
    
    public SousCategorie() {
        produits = new ArrayList<>(20);
        menus = new ArrayList<>(10);
    }

    public SousCategorie(String idSousCategorie) {
        this();
        this.idSousCategorie = idSousCategorie;
    }

    public SousCategorie(String idSousCategorie, Categorie categorie) {
        this();
        this.idSousCategorie = idSousCategorie;
        this.categorie = categorie;
    }
    
    
    

    public SousCategorie(String idSousCategorie, Categorie categorie, Collection<Produit> produits, Collection<Menu> menus) {
        this.idSousCategorie = idSousCategorie;
        this.categorie = categorie;
        this.produits = produits;
        this.menus = menus;
    }

    public String getIdSousCategorie() {
        return idSousCategorie;
    }

    public void setIdSousCategorie(String idSousCategorie) {
        this.idSousCategorie = idSousCategorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    public Collection<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Collection<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "SousCategorie{" + "idSousCategorie=" + idSousCategorie + ", categorie=" + categorie + ", produits=" + produits + ", menus=" + menus + '}';
    }
    
    
}
