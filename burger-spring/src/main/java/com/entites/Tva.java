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
import javax.persistence.OneToMany;

@Entity
public class Tva implements  Serializable {
    @Id
    private Double taux;
    
    @OneToMany(mappedBy = "tva")
    private Collection<Produit> produits;

    public Tva() {
        this.produits = new ArrayList();
    }

    public Tva(Double taux, Collection<Produit> produits) {
        this.taux = taux;
        this.produits = produits;
    }

    public Tva(Double taux) {
        this.taux = taux;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Tva{" + "taux=" + taux + ", produits=" + produits + '}';
    }
    
    
            
}
