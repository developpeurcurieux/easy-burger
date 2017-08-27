/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.model;

import com.entites.Categorie;
import com.entites.Produit;
import com.entites.SousCategorie;
import com.metier.IClientMetier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author CDI213
 */
@Component
public class GestionProduit implements Serializable {
    
    @Autowired
            IClientMetier clientMetier;
    
   
    
    private HashMap<String, List> listeProduitsParCategories;
    private List<Produit> listeEntrees;
    private List<Produit> listePlats;
    private List<Produit> listeDesserts;
    private List<Produit> listeBoissons;
    private int qteProduit;
    private String idProduit;
   
    
    
    
    public GestionProduit() {
        
        
    }
    
    // il faut toujours injecter le ejb apres la construction du pojo (jamais dans le constructeur)
    public void initGestionProduit() {
        listeProduitsParCategories = new HashMap();
        
        System.out.println("client ==> " + clientMetier);
        List<Produit> listeProduits = clientMetier.consulterLaCarte();
        
        listeEntrees = new ArrayList();
        listePlats = new ArrayList();
        listeDesserts = new ArrayList();
        listeBoissons = new ArrayList();
        
        
        SousCategorie sc;
        Categorie c;
        
        for(Produit p : listeProduits) {
            
            sc = p.getSousCategorie();
            c = sc.getCategorie();
            
            String s = c.getIdCategorie();
            
            switch (s) {
                case "entrees": listeEntrees.add(p);
                break;
                case "plats" : listePlats.add(p);
                break;
                case "desserts" : listeDesserts.add(p);
                break;
                case "boissons" : listeBoissons.add(p);
                break;
            }
            
        }
        
       
        
        
        
        
        listeProduitsParCategories.put("entrees", listeEntrees);
        listeProduitsParCategories.put("plats", listePlats);
        listeProduitsParCategories.put("desserts", listeDesserts);
        listeProduitsParCategories.put("boissons", listeBoissons);
        
        
    }
    
    
    
    public HashMap<String, List> getListeProduitsParCategories() {
        return listeProduitsParCategories;
    }

    public List<Produit> getListeEntrees() {
        return listeEntrees;
    }

    public List<Produit> getListePlats() {
        return listePlats;
    }

    public List<Produit> getListeDesserts() {
        return listeDesserts;
    }

    public List<Produit> getListeBoissons() {
        return listeBoissons;
    }
    
    public Produit getProduitById(String reference) {
        Produit p;
        return p = clientMetier.consulterProduit(reference);
    }

    public int getQteProduit() {
        return qteProduit;
    }

    public void setQteProduit(int qteProduit) {
        this.qteProduit = qteProduit;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }
    
    
}
