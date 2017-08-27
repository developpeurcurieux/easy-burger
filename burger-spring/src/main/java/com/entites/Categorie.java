package com.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements  Serializable {
    
    
    @Id
    private String idCategorie;
    
    @OneToMany(mappedBy = "categorie")
    private Collection<SousCategorie> sousCategories;
    
    public Categorie() {
      this.sousCategories = new ArrayList();
    }

    public Categorie(String idCategorie) {
        this();
        this.idCategorie = idCategorie;
    }
    
    
    
    public Categorie(String idCategorie, Collection<SousCategorie> sousCategories) {
        this.idCategorie = idCategorie;
        this.sousCategories = sousCategories;
    }

    public String getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(String idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Collection<SousCategorie> getSousCategories() {
        return sousCategories;
    }

    public void setSousCategories(Collection<SousCategorie> sousCategories) {
        this.sousCategories = sousCategories;
    }

    @Override
    public String toString() {
        return "Categorie{" + "idCategorie=" + idCategorie + ", sousCategories=" + sousCategories + '}';
    }


    
    
}