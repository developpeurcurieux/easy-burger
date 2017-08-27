package com.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
//@NamedQueries({
//    @NamedQuery(name = "entites.Commande.addCommande",query = "insert into commande ('datecommandre', 'statut-id') values ("),
//    @NamedQuery(name = "entites.Commande.modifierCommande",query = "Update"),
//    @NamedQuery(name = "entites.Commande.consulterCommande",query = "select"),
//    @NamedQuery(name = "entites.Commande.consulterLesCommandes",query = "select"),
//    @NamedQuery(name = "entites.Commande.supprimerCommande",query = "delete")
//})
public class Commande implements  Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCommande;
    
    @ManyToMany
    @JoinTable(name = "TABLECLIENT_COMMANDE")
    private Collection<TableClient> tablesClient;
    
    @OneToMany(mappedBy = "commande")
    public Collection<LigneCommande> lignesCommande;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Statut statut;

    
    
    public Commande() {
        tablesClient = new ArrayList<>();
        lignesCommande = new ArrayList<>(); 
    }
    
    

    public Commande(Date dateCommande, Statut statut) {
        this();
        this.dateCommande = dateCommande;
        this.statut = statut;
    }
    
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Collection<TableClient> getTablesClient() {
        return tablesClient;
    }

    public void setTablesClient(Collection<TableClient> tablesClient) {
        this.tablesClient = tablesClient;
    }
    
    
    public Collection<LigneCommande> getLignesCommande() {
        return lignesCommande;
    }

    public void setLignesCommande(Collection<LigneCommande> lignesCommande) {
        this.lignesCommande = lignesCommande;
    }
    
    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande{" + "dateCommande=" + dateCommande + ", tables=" + tablesClient + ", lignesCommande=" + lignesCommande + ", statut=" + statut + '}';
    }

    

    

    

    
}
