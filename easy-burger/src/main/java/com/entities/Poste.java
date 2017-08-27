/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Poste implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String nomPoste;
    
    @ManyToMany
    @JoinTable(name = "EMP_POSTE")
    private Collection<Employe> employes;

    public Poste() {
    }

    public String getNomPoste() {
        return nomPoste;
    }

    public void setNomPoste(String nomPoste) {
        this.nomPoste = nomPoste;
    }

    

    public Collection<Employe> getEmployes() {
        return employes;
    }

    public void setEmploye(Collection<Employe> employes) {
        this.employes = employes;
    }
    
    
    
    
    
}
