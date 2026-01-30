package org.example;

import java.util.ArrayList;

public class Portfolio<T extends  Asset>{
    private ArrayList<T> assets;
    private Double quantite;
    private Double valeurtotale;

    public Portfolio(){
        this.valeurtotale=0.0;
        assets=new ArrayList<>();
    }
    public void Ajouter_Asset_to_portoflio(T asset , Double quantite){
        if(asset == null || quantite <= 0){
            System.out.println("invaid ");
            return;
        }
        assets.add(asset);
        this.quantite = quantite;
        this.valeurtotale+=asset.getPrice()*quantite;
        System.out.println("Asset added successfully");
    }
    public ArrayList<T> getAssets() {return assets;}
    public Double getQuantite() {return quantite;}
    public Double getValeurtotale() {return valeurtotale;}

    @Override
    public String toString() {
        return "Portfolio{" +
                "Assets=" + assets +
                ", quantite=" + quantite +
                ", valeurtotale=" + valeurtotale +
                '}';
    }
}
