/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metier;

import com.dao.ICategorieRepository;
import com.dao.ICommandeRepository;
import com.dao.ICommentaireRepository;
import com.dao.IEmployeRepository;
import com.dao.IIngredientRepository;
import com.dao.ILigneCommandeRepository;
import com.dao.IMenuRepository;
import com.dao.IPosteRepository;
import com.dao.IProduitRepository;
import com.dao.IPromotionRepository;
import com.dao.ISousCategorieRepository;
import com.dao.IStatutRepository;
import com.dao.ITableClientRepository;
import com.dao.ITvaRepository;
import com.entites.Employe;
import com.entites.Menu;
import com.entites.Produit;
import com.entites.TableClient;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CDI213
 */
@Service
public class ClientMetierImpl implements IClientMetier {
    
     @Autowired
    private IProduitRepository produitRepository;
    
    @Autowired
    private ICategorieRepository categorieRepository;

    @Autowired
    private ICommandeRepository commandeRepository;
    
    @Autowired
    private ICommentaireRepository commentaireRepository;
    
    @Autowired
    private IEmployeRepository employeRepository;
    
    @Autowired
    private IIngredientRepository ingredientRepository;
    
    @Autowired
    private ILigneCommandeRepository ligneCommandeRepository;
    
    @Autowired
    private IMenuRepository menuRepository;
    
    @Autowired
    private IPosteRepository posteRepository;
    
    @Autowired
    private IPromotionRepository promotionRepository;
    
    @Autowired
    private ISousCategorieRepository sousCategorieRepository;
    
    @Autowired
    private IStatutRepository statutRepository;
    
    @Autowired
    private ITableClientRepository tableClientRepository;
    
    @Autowired
    private ITvaRepository tvaRepository;
    
    public ClientMetierImpl() {
    }

    @Override
    public Produit addProduit(Produit produit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Menu addMenu(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produit consulterProduit(String idProduit) {
        if(idProduit != null) {
            return produitRepository.findOne(idProduit);
        }
        else {
            throw new UnsupportedOperationException("Produit non trouve"); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public List<Produit> consulterLaCarte() {
      List<Produit> listeProduits = new ArrayList(20);
        for (Produit produit : produitRepository.findAll()) {
            listeProduits.add(produit);
        }
       
        return listeProduits;
    }

    @Override
    public List<Menu> consulterMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employe appelerServeur(TableClient tableClient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ClientMetierImpl{" + "produitRepository=" + produitRepository + '}';
    }
    
    
}
