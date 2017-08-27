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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity 
public class Commande implements Serializable {
     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idCommande;
     
     @Temporal(TemporalType.DATE)
     private Date dateCommande;
     
     @ManyToMany
     @JoinTable(name = "TABLECLIENT_ COMMANDE")
     private Collection<TableClient> tableClients;
     
     @OneToMany(mappedBy = "commande")
     public Collection<LigneCommande> ligneCommandes;
     
     @ManyToOne
     private Statut statut;

    public Commande() {
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Collection<TableClient> getTableClients() {
        return tableClients;
    }

    public void setTableClients(Collection<TableClient> tableClients) {
        this.tableClients = tableClients;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    
    
     
}
