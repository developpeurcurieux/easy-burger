/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Promotion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotion;
    
    private String nom;
    private double remise;
    private String description;
    private String photo;
    
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    
    @ManyToMany
    @JoinTable(name = "PROMOTION_PRODUIT")
    private Collection<Produit> produits;

    public Promotion() {
    }

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    
    
    
    
}
