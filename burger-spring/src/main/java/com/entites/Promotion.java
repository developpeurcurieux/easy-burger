
package com.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
//@NamedQueries({
//    @NamedQuery(name="entites.Promotion.addPromotion", query="insert"),
//    @NamedQuery(name="entites.Promotion.modifierPromotion", query="update"),
//    @NamedQuery(name="entites.Promotion.consulterPromotion", query="select"),
//    @NamedQuery(name="entites.Promotion.consulterLesPromotions", query="select"),
//    @NamedQuery(name="entites.Promotion.supprimerPromotion", query="delete"),
//})
public class Promotion implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotion;
    
    private String nomPromotion;
    private double remise;
    private String Description;
    private String image;
    
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    
    @Temporal(TemporalType.DATE)
    private Date dateFin;
   
    @ManyToMany
    @JoinTable(name = "PROMOTION_PRODUIT")
    private Collection<Produit> produits;

    public Promotion() {
        this.produits = new ArrayList();
    }

    public Promotion(String nomPromotion, Date dateDebut, Date dateFin, double remise, String Description, String image, Collection<Produit> produits) {
        this();
        this.nomPromotion = nomPromotion;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.remise = remise;
        this.Description = Description;
        this.image = image;
        this.produits = produits;
    }

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public String getNomPromotion() {
        return nomPromotion;
    }

    public void setNomPromotion(String nomPromotion) {
        this.nomPromotion = nomPromotion;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Promotion{" + "idPromotion=" + idPromotion + ", nomPromotion=" + nomPromotion + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", remise=" + remise + ", Description=" + Description + ", image=" + image + ", produits=" + produits + '}';
    }
    
    
    
            
}
