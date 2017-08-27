/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.entites.Panier;
import com.entites.Produit;
import com.model.GestionProduit;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author kakashi
 */

@Controller
@RequestMapping(value="/")
public class CarteController {
    
    @Autowired
    private GestionProduit gestionProduit;
    
   

    @RequestMapping("")
    public String produits(Model model) {
      
        gestionProduit.initGestionProduit();
        
        HashMap<String, List> listeProduitParCategories = gestionProduit.getListeProduitsParCategories();
           
        model.addAttribute("gestionProduit", gestionProduit);
        model.addAttribute("listeProduitParCategories", listeProduitParCategories);
        model.addAttribute("title", "La Carte");
                
        return "carte";
    }
    
    @RequestMapping("/commentaire")
    public String commentaire(Model model) {
        model.addAttribute("title", "Commentaire Produit");
      return "commentaire";
    }
    
    
    
}
