/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Panier implements Serializable {
    private Map<String, LigneCommande> items = new HashMap();
    
    
    public void addProduit(Produit p, int quantite) {
        LigneCommande lc = items.get(p.getReference());
        
        if(lc != null) {
            lc.setQuantite(lc.getQuantite() + quantite);
        }
        else {
            System.out.println("-------------------debut---------------");
            lc = new LigneCommande();
            lc.setProduit(p);
            lc.setQuantite(quantite);
            lc.setPrix(p.getPrixHT());
            System.out.println("Prix HT: " + p.getPrixHT());
            items.put(p.getReference(), lc);
            System.out.println("-------------------- fin -------------------");
        }
    }
    
    
    
    public void addProduit(Produit p) {
        LigneCommande lc = items.get(p.getReference());
        
        if(lc != null) {
            lc.setQuantite(lc.getQuantite() + 1);
        }
        else {
            System.out.println("-------------------debut---------------");
            lc = new LigneCommande();
            lc.setProduit(p);
            lc.setQuantite(1);
            lc.setPrix(p.getPrixHT());
            System.out.println("Prix HT: " + p.getPrixHT());
            items.put(p.getReference(), lc);
            System.out.println("-------------------- fin -------------------");
        }
    }
    
    
    
     public void removeProduit(Produit p, int quantite) {
        LigneCommande lc = items.get(p.getReference());
        
        if(lc != null) {
            if(lc.getQuantite() <= 0) {
                return;
            }
            else {
            lc.setQuantite(lc.getQuantite() - quantite);
            }
        }
        
    }
    
      public void removeAll(Produit p) {
        LigneCommande lc = items.get(p.getReference());
        
        if(lc != null) {
            items.remove(p.getReference(), lc);
        }
        
        
    }
     
    
    
    
    
    
    
    
  
    
    public Collection getCommandes() {
                
        return items.values();
        
    }
    
    public double getTotal() {
        double total = 0;
        for(LigneCommande lc : items.values()) {
            total += lc.getPrix() * lc.getQuantite();
        }
        return total;
    }

    public int getSize() {
        return items.size();
    }
    
    public int getQteProduits() {
        int q = 0;
        
        for(LigneCommande lc : items.values()) {
            q += lc.getQuantite();
        }
        
        return q;
        
    }
    
    
    public void deleteProduit(String referenceProduit) {
        items.remove(referenceProduit);
    }

    public Map<String, LigneCommande> getItems() {
        return items;
    }

   
  
    
    
}
