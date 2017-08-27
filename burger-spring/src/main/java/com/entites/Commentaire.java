
package com.entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire;
    private String Description;
    
    @ManyToOne
    @JoinColumn(name = "FK_MENUSELECTION")
    private MenuSelection menuSelection;
    
    @ManyToOne
    @JoinColumn(name = "FK_PRODUIT")
    private Produit produit;

    public Commentaire() {
    }

    public Commentaire(String Description) {
        this.Description = Description;
    }

    public Commentaire(Long idCommentaire, String Description, MenuSelection menuSelection, Produit produit) {
        this.idCommentaire = idCommentaire;
        this.Description = Description;
        this.menuSelection = menuSelection;
        this.produit = produit;
    }

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Long idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
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

    @Override
    public String toString() {
        return "Commentaire{" + "idCommentaire=" + idCommentaire + ", Description=" + Description + ", menuSelection=" + menuSelection + ", produit=" + produit + '}';
    }

   
}
