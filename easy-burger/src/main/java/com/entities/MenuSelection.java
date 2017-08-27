/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class MenuSelection implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenuSelection;
    
    @ManyToOne
    private Menu menu;
    
    @OneToMany
    private Collection<Commentaire> commentaires;
    
    @OneToMany
    private Collection<LigneCommande> ligneCommandes;

    public MenuSelection() {
    }

    public Long getIdMenuSelection() {
        return idMenuSelection;
    }

    public void setIdMenuSelection(Long idMenuSelection) {
        this.idMenuSelection = idMenuSelection;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Collection<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Collection<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
    
    
    

}
