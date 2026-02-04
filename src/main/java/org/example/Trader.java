package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Trader extends Person{
    private Double Solde;
    private Portfolio<Asset> portfolio;
    ArrayList<Transaction> transactions;

    public Trader(int id, String Nom, double Solde,Portfolio<Asset> portfolio){
        super(id,Nom);
        this.Solde=Solde;
        this.transactions=new ArrayList<>();
        this.portfolio = portfolio;
    }
    public Trader(){
        this.Solde=0.0;
        this.transactions=new ArrayList<>();
        this.portfolio = new Portfolio<>();
    }
    public double getSolde() {return Solde;}
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


    public void Acheter_Actif(Asset A, double quantete){
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
        }else{
            System.out.println("Solde Insufficient");
            return;
        }
        this.portfolio.Ajouter_Asset_to_portoflio(A,quantete);
        Transaction transaction = new Transaction(A.getType(), A.getName(), quantete, (float) A.getPrice(), LocalDate.now());
        // 4️⃣ Save transaction
        this.transactions.add(transaction);
        System.out.println("Actif acquis avec succès");
        if (A instanceof Stock) {
            System.out.println("Action achetée avec succès");
        } else if (A instanceof CryptoCurrency) {
            System.out.println("Crypto-monnaie achetée avec succès");
        } else {
            System.out.println("Actif acheté avec succès");
        }
    }

}
