/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import org.springframework.stereotype.Component;

/**
 *
 * @author kakashi
 */

@Component
public class GestionUser {
    private User user;
    private final String ERREUR = "Identification incorrecte";
    
    public GestionUser() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getERREUR() {
        return ERREUR;
    }
    
    
    
    
    
    public boolean checkMdp() {
        if(user.getMdp().equals("1212")) {
            return true;
        }
        else {
            return false;
        }
        
    }
        
    
    
}
