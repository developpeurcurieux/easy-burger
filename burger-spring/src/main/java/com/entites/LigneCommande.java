package com.entites;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
//@NamedQueries({
//    @NamedQuery(name = "entites.LigneCommande.addLigneCommande", query = "insert"),
//    @NamedQuery(name="entites.LigneCommande.modifierLigneCommande", query="update"),
//    @NamedQuery(name="entites.LigneCommande.consulterLigneCommande", query="select"),
//    @NamedQuery(name="entites.LigneCommande.consulterLesLignesCommandes",query="select"),
//    @NamedQuery(name="entites.LigneCommande.supprimerLigneCommande",query="delete")
//})
public class LigneCommande implements  Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String commentaire;
    private String type;
    private double prix;
    private double tva;
    private double remise;
    private int quantite;

    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FK_COMMANDE")
    private Commande commande;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FK_STATUT")
    private Statut statut;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FK_PRODUIT")
    private Produit produit;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FK_MENUSELECTION")
    private MenuSelection menuSelection;

    public LigneCommande() {
    }

    public LigneCommande(String commentaire, String type, double prix, double tva, double remise) {
        this.commentaire = commentaire;
        this.type = type;
        this.prix = prix;
        this.tva = tva;
        this.remise = remise;
    }

    public LigneCommande(String commentaire, String type, double prix, double tva, double remise, Commande commande, Statut statut, Produit produit, MenuSelection menuSelection) {
        this.commentaire = commentaire;
        this.type = type;
        this.prix = prix;
        this.tva = tva;
        this.remise = remise;
        this.commande = commande;
        this.statut = statut;
        this.produit = produit;
        this.menuSelection = menuSelection;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public MenuSelection getMenuSelection() {
        return menuSelection;
    }

    public void setMenuSelection(MenuSelection menuSelection) {
        this.menuSelection = menuSelection;
    }

    
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    @Override
    public String toString() {
        return "LigneCommande{" + "id=" + id + ", commentaire=" + commentaire + ", type=" + type + ", prix=" + prix + ", tva=" + tva + ", remise=" + remise + ", commande=" + commande + ", statut=" + statut + ", produit=" + produit + ", menuSelection=" + menuSelection + '}';
    }

}
