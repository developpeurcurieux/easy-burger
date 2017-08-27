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
import com.entites.Produit;
import com.entites.SousCategorie;
import com.entites.TableClient;
import java.util.List;


public interface IClientMetier {
    
    public Produit addProduit(Produit produit);
    public Menu addMenu(Menu menu);
    public Produit consulterProduit(String idProduit);
    public List<Produit>consulterLaCarte();
    public List<Menu> consulterMenu();
    public Employe appelerServeur(TableClient tableClient);
    
}
