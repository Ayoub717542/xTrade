package org.example;

import java.time.LocalDate;

public class Transaction {
    private Trader trader;
    private  String type_Operation;
    private String actif;
    private  Double quantite;
    private float prix;
    private LocalDate date;

    public Transaction(String type_Operation, String actif, Double quantite, float prix , LocalDate date){
        this.type_Operation=type_Operation;
        this.actif=actif;
        this.quantite=quantite;
        this.prix=prix;
        this.date=date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type_Operation='" + type_Operation + '\'' +
                ", actif='" + actif + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", date=" + date +
                '}';
    }

    public String isType_Opération() {return type_Operation;}
    public String getActif() {return actif;}
    public Double getQuantite() {return quantite;}
    public float getPrix() {return prix;}
    public LocalDate getDate() { return date; }
    public Trader getTrader() {return trader;}

}
