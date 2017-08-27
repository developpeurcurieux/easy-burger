/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.io.Serializable;
import org.springframework.stereotype.Component;


/**
 *
 * @author kakashi
 */

@Component
public class User implements Serializable{
    private String mdp;

    public User() {
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    
    
    
}
