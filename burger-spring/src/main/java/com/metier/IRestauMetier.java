/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metier;

import com.entites.Categorie;
import com.entites.Commentaire;
import com.entites.Employe;
import com.entites.Ingredient;
import com.entites.Menu;
import com.entites.MenuSelection;
import com.entites.Poste;
import com.entites.Produit;
import com.entites.Promotion;
import com.entites.SousCategorie;
import com.entites.Statut;
import com.entites.TableClient;
import com.entites.Tva;
import java.util.List;

/**
 *
 * @author testo
 */
public interface IRestauMetier {
    
        //Employe
    public Employe addEmploye(Employe employe);
    public Employe modifierEmploye(Employe employe);
    public Employe consulterEmploye(Long idEmploye);
    public List<Employe> consulterLesEmployes();
    public void supprimerEmploye(Employe employe);
    
//Poste
    public Poste addPoste(Poste poste);
    public Poste modifierPoste(Poste poste);
    public Poste consulterPoste(Long idPoste);
    public List<Poste> consulterLesPostes();
    public void supprimerPoste(Poste poste);
    
//TableClient
    public TableClient addTable(TableClient tableClient);
    public TableClient modifierTableClient(TableClient tableClient);
    public TableClient consulterTableClient(Long idTableClient);
    public List<TableClient> consulterLesTablesClient();
    public void supprimerTableClient(TableClient tableClient);
    
////Commande    
//    public Commande addCommande(Commande commande);
//    public Commande modifierCommande(Commande commande);
//    public Commande consulterCommande(Integer idCommande);
//    public List<Commande> consulterLesCommandes();
//    public void supprimerCommande(Commande commande);
//    public float getPrixTotalHT();
    
//Statut
    public Statut addStatut(Statut statut);
    public Statut modifierStatut(Statut statut);
    public Statut consulterStatut(Long idStatut);
    public List<Statut> consulterLesStatus();
    public void supprimerStatut(Statut statut);
    
//Categorie 
    public Categorie addCategorie(Categorie categorie);
    public Categorie modifierCategorie(Categorie categorie);
    public Categorie consulterCategorie(String idCategorie);
    public List<Categorie> consulterLesCategories();
    public void supprimerCategorie(Categorie categorie);
    
//SousCategorie
    public SousCategorie addSousCategorie(SousCategorie sousCategorie);
    public SousCategorie modifierSousCategorie(SousCategorie sousCategorie);
    public SousCategorie consulterSousCategorie(String idSousCategorie);
    public List<SousCategorie> consulterLesSousCategories();
    public void supprimerSousCategorie(SousCategorie sousCategorie);
    
//Produit
    public Produit addProduit(Produit produit);
    public Produit modifierProduit(Produit produit);
    public Produit consulterProduit(String referenceProduit);
    public List<Produit> consulterLesProduits();
    public void supprimerProduit(Produit produit);
    
//Ingredient
    public Ingredient addIngredient(Ingredient ingredient);
    public Ingredient modifierIngredient(Ingredient ingredient);
    public Ingredient consulterIngredient(String idIngredient);
    public List<Ingredient> consulterLesIngredients();
    public void supprimerIngredient(Ingredient ingredient);
        
//Promotion
    public Promotion addPromotion(Promotion promotion);
    public Promotion modifierPromotion(Promotion promotion);
    public Promotion consulterPromotion(Long idPromotion);
    public List<Promotion> consulterLesPromotions();
    public void supprimerPromotion(Promotion promotion);
    
//Menu
    public Menu addMenu(Menu menu);
    public Menu modifierMenu(Menu menu);
    public Menu consulterMenu(String idMenu);
    public List<Menu> consulterLesMenus();
    public void supprimerMenu(Menu menu);

//MenuSelection
    public MenuSelection addMenuSelection(MenuSelection menuSelection);
    public MenuSelection modifierMenuSelection(MenuSelection menuSelection);
    public MenuSelection consulterMenuSelection(Long idMenuSelection);
    public List<MenuSelection> consulterLesMenuSelections();
    public void supprimerMenuSelection();
    
//Commentaire
    public Commentaire addCommentaire(Commentaire commentaire);
    public Commentaire modifierCommentaire(Commentaire commentaire);
    public Commentaire consulterCommentaire(Long idCommentaire);
    public List<Commentaire> consulterLesCommentaires();
    public void supprimerCommentaire(Commentaire commentaire);
    
////LigneCommande
//    public LigneCommande addLigneCommande(LigneCommande ligneCommande);
//    public LigneCommande modifierLigneCommande(LigneCommande ligneCommande);
//    public LigneCommande consulterLigneCommande(Long idLignCommande);
//    public List<LigneCommande> consulterLesLignesCommandes();
//    public void supprimerLigneCommande(LigneCommande ligneCommande);
    
    //Tva
    public Tva addTva(Tva tva);
    public Tva modifierTva(Tva tva);
    public Tva consulterTva();
    public List<Tva> consulterLesTvas();
    public void supprimerTva(Tva tva);
}
