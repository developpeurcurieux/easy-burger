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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class SousCategorie implements Serializable {
     private static final long serialVersionUID = 1L;
     
    @Id
    private String nomSousCategorie;
    
    @ManyToOne
    @JoinColumn(name="FK_CATEGORIE")
    private Categorie categorie;
    
    @OneToMany(mappedBy="sousCategorie")
    private Collection<Produit> produits;
    
    @ManyToMany(mappedBy="sousCategories")
    private Collection<Menu> menus;

    public SousCategorie() {
    }

    public SousCategorie(String nomSousCategorie, Categorie categorie) {
        this.nomSousCategorie = nomSousCategorie;
        this.categorie = categorie;
    }
    
    
    
    
    
    public String getNomSousCategorie() {
        return nomSousCategorie;
    }

    public void setNomSousCategorie(String nomSousCategorie) {
        this.nomSousCategorie = nomSousCategorie;
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
    
    
    
    
}
