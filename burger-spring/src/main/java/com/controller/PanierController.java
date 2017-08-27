/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.entites.Panier;
import com.entites.Produit;
import com.model.GestionProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@Scope("request")
public class PanierController {
    @Autowired
    private Panier panier;
    
    @Autowired
    private GestionProduit gestionProduit;
    
    
    //TODO il ne faut pas oublier de gerer le panier par rapport au numero de la table
    
    @RequestMapping("/ajouterAuPanier")
    public String ajoutProduitPanier(Model model, @RequestParam("idProduit") String idProduit, @RequestParam("qteProduit") int qteProduit) {
        Produit p = gestionProduit.getProduitById(idProduit);
           
        panier.addProduit(p, qteProduit);
        
        if(model.containsAttribute("panier")) {
            return "redirect:/";
        }
        else {
        model.addAttribute("panier", panier);
        return "redirect:/";
        }
    } 
    
    
    @RequestMapping("/envoiCommande") 
    public String envoiCommande(Model model) {
        return "carte";
    }
    
    @RequestMapping("/panier") 
    public String panier() {
        return "panier";
    }

   
     
    @RequestMapping("/addProduitPanier") 
        public String addProduitPanier(Model model, @RequestParam("idProduit") String idProduit, @RequestParam("qte") int qte) {
            Produit p = gestionProduit.getProduitById(idProduit);
            
            panier.addProduit(p, qte);
//            
//            if(model.containsAttribute("panier")) {
//                panier.addProduit(p, qte);
//            }
            
            return "redirect:/panier";
            
        }
    
    
    
    @RequestMapping("/removeProduitPanier") 
        public String removeProduitPanier(Model model, @RequestParam("idProduit") String idProduit, @RequestParam("qte") int qte) {
            Produit p = gestionProduit.getProduitById(idProduit);
            panier.removeProduit(p, qte);
//            if(model.containsAttribute("panier")) {
//                panier.removeProduit(p, qte);
//            }
//            
            return "redirect:/panier";
            
        }
    
        @RequestMapping("/deleteAllProduits")
        public String deleteAllProduits(Model model, @RequestParam("idProduit") String idProduit) {
            Produit p = gestionProduit.getProduitById(idProduit);
            panier.removeAll(p);
            
            return "redirect:/panier";
        }
    
}
