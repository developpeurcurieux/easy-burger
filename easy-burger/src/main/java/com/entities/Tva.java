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
public class Tva implements Serializable {
     private static final long serialVersionUID = 1L;
     
     @Id
     private Double tauxTva;
     
     @OneToMany(mappedBy="tva")
     private Collection<Produit> produits;

    public Tva() {
    }

    public Double getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(Double tauxTva) {
        this.tauxTva = tauxTva;
    }

   
    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
     
     
}
