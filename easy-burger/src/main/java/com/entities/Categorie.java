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
import javax.persistence.OneToMany;



@Entity
public class Categorie implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    private String nom;
    
    @OneToMany(mappedBy= "categorie")
    private Collection<SousCategorie> sousCategories;

    public Categorie() {
    }

    public Categorie(Collection<SousCategorie> sousCategories) {
        this.sousCategories = sousCategories;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

      

   

    public Collection<SousCategorie> getSousCategories() {
        return sousCategories;
    }

    public void setSousCategories(Collection<SousCategorie> sousCategories) {
        this.sousCategories = sousCategories;
    }
    
    
    
}
