 
package com.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author testo
 */
@Entity
public class Poste implements  Serializable {
    @Id
    private String nomPoste;
    
    @ManyToMany
    @JoinTable(name = "EMP_POSTE")
    Collection<Employe> employes;
    
    public Poste() {
        this.employes = new ArrayList();
    }
    
    public Poste(String nomPoste) {
        this();
        this.nomPoste = nomPoste;
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

    public void setEmployes(Collection<Employe> employes) {
        this.employes = employes;
    }
    
    
    
}
