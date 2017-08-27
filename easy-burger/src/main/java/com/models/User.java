/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.models;

import java.io.Serializable;
import org.springframework.stereotype.Component;



@Component
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int mdp;

    public User() {
    }
    
    
    

    public User(int mdp) {
        this.mdp = mdp;
    }

    public int getMdp() {
        return mdp;
    }

    public void setMdp(int mdp) {
        this.mdp = mdp;
    }
    
    

}
