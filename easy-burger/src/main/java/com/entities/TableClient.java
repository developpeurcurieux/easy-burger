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
import javax.persistence.ManyToMany;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.any;



@Entity
public class TableClient implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTableClient;
    private int capacite;
    private boolean etat;
    private int numero;
    
    @ManyToMany(mappedBy = "tableClients")
    private Collection<Commande> commandes;

    public TableClient() {
    }

    public Long getIdTableClient() {
        return idTableClient;
    }

    public void setIdTableClient(Long idTableClient) {
        this.idTableClient = idTableClient;
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
