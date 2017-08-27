/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author cdi214
 */
@Entity
public class MenuSelection implements  Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Menu menuChoix;
    @OneToMany
    private Collection<Commentaire> com;
    @OneToMany
    private Collection<LigneCommande> lgc;

    public MenuSelection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Menu getMenuChoix() {
        return menuChoix;
    }

    public void setMenuChoix(Menu menuChoix) {
        this.menuChoix = menuChoix;
    }

    public Collection<Commentaire> getCom() {
        return com;
    }

    public void setCom(Collection<Commentaire> com) {
        this.com = com;
    }

    public Collection<LigneCommande> getLgc() {
        return lgc;
    }

    public void setLgc(Collection<LigneCommande> lgc) {
        this.lgc = lgc;
    }

    
    
   
    
}
