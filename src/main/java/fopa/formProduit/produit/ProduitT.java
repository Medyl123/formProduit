package fopa.formProduit.produit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProduitT {
    @Id
    private long id;
    private String nomP;
    private int prixP;
    private int qteP;

    public ProduitT() {

    }

    public ProduitT(long id, String nomP, int prixP, int qteP) {
        super();
        this.id = id;
        this.nomP = nomP;
        this.prixP = prixP;
        this.qteP = qteP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public int getPrixP() {
        return prixP;
    }

    public void setPrixP(int prixP) {
        this.prixP = prixP;
    }

    public int getQteP() {
        return qteP;
    }

    public void setQteP(int qteP) {
        this.qteP = qteP;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
