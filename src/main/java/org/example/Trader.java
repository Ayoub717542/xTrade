package org.example;

import java.util.ArrayList;

public class Trader extends Person{
    private Double Solde;
    private Portfolio<Asset> portfolio;
    ArrayList<Transaction> transactions;

    public Trader(int id, String Nom, Double Solde,Portfolio<Asset> portfolio){
        super(id,Nom);
        this.Solde=Solde;
        this.transactions=new ArrayList<>();
        this.portfolio = portfolio;
    }
    public Double getSolde() {return Solde;}
    public ArrayList<Transaction> getTransactions() {return transactions;}
    public Portfolio getPortfolio() {return portfolio;}

    public void Afficher_Portfolio() {
        if (portfolio != null) {
            System.out.println("=== Portfolio ===");
            System.out.println("Quantité : " + portfolio.getQuantite());
            System.out.println("Valeur totale : " + portfolio.getValeurtotale());
        } else {
            System.out.println("Aucun portfolio");
        }
    }
    public void Acheter_Actif( Asset A,double quantete){
        double totalPrice=0.0;
        TradingPlatform t = new TradingPlatform();
        if (quantete>0){
             totalPrice=A.getPrice()*quantete;
        }else{
            System.out.println("Insufficient balance");
            return;
        }
        if(this.Solde>=totalPrice){
            this.Solde-=totalPrice;
        }
        this.portfolio.Ajouter_Asset_to_portoflio(A,quantete);
        System.out.println("Actif acquis avec succès");
    }
}
