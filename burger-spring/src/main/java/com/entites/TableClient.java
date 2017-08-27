package com.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQueries({
//    @NamedQuery(name="entites.TableClient.addTable", query="insert"),
//    @NamedQuery(name="entites.TableClient.modifierTable", query="update"),
//    @NamedQuery(name="entites.TableClient.consulterTable", query="select"),
//    @NamedQuery(name="entites.TableClient.consulterLesTablesClient", query="select"),
//    @NamedQuery(name="entites.TableClient.supprimerTable", query="delete"),
//})
public class TableClient implements  Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int capacite;
    
    private boolean etat;
    
    private int numero;
    
    
    @ManyToMany(mappedBy = "tablesClient")
    private Collection<Commande> commandes;

    public TableClient() {
        commandes = new ArrayList<>();
    }

    public TableClient(int capacite, boolean etat, int numero) {
        this();
        this.capacite = capacite;
        this.etat = etat;
        this.numero = numero;
    }
    
    
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
    
    
    
    
}
