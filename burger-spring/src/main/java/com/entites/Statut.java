package com.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
//@NamedQueries({
//    @NamedQuery(name="entites.Statut.addStatut", query="insert"),
//    @NamedQuery(name="entites.Statut.modifierStatut", query="update"),
//    @NamedQuery(name="entites.Statut.consulterStatut", query="select"),
//    @NamedQuery(name="entites.Statut.consulterLesStatuts", query="select"),
//    @NamedQuery(name="entites.Statut.supprimerStatut", query="delete")
//})
public class Statut implements  Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numero;
    private String libelle;

    @OneToMany(mappedBy = "statut")
    private Collection<Commande> commandes;

    @OneToMany(mappedBy = "statut")
    private Collection<LigneCommande> lignesCommande;

    public Statut() {
        commandes = new ArrayList<>();
        lignesCommande = new ArrayList<>();
    }

    public Statut(int numero, String libelle) {
        this();
        this.numero = numero;
        this.libelle = libelle;
    }
            
          
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    
    
    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public Collection<LigneCommande> getLignesCommande() {
        return lignesCommande;
    }

    public void setLignesCommande(Collection<LigneCommande> lignesCommande) {
        this.lignesCommande = lignesCommande;
    }
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statut)) {
            return false;
        }
        Statut other = (Statut) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Statut[ id=" + id + " ]";
    }

}
