package org.example;

import java.util.Date;

public class Transaction {
    private  String type_Operation;
    private String actif;
    private  Double quantite;
    private float prix;
    private Date date;

    public Transaction(String type_Operation, String actif, Double quantite, float prix , Date date){
        this.type_Operation=type_Operation;
        this.actif=actif;
        this.quantite=quantite;
        this.prix=prix;
        this.date=date;
    }
    public String isType_Opération() {return type_Operation;}
    public String getActif() {return actif;}
    public Double getQuantite() {return quantite;}
    public float getPrix() {return prix;}
    public Date getDate() {return date;}

}
