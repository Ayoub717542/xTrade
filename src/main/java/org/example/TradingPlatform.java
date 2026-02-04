package org.example;
import java.util.ArrayList;

public class TradingPlatform {
    ArrayList<Trader>traders;
    ArrayList<Asset>assets;
    ArrayList<Transaction>transactions;

    public TradingPlatform(){
        this.traders=new ArrayList<>();
        this.assets=new ArrayList<>();
        this.transactions = new ArrayList<>();
    }
    public void ajouter_Actif(Asset A){
        assets.add(A);
        System.out.println("Actif ajouté avec succés");
    }

    public void ajouter_Trader(Trader trader){
        traders.add(trader);
        System.out.println("Trader ajouté avec succès");
    }
    public void Afficher_Trader(){
        System.out.println("********* Les Traders **********");
        for(Trader trader: traders){
            System.out.println("ID :"+trader.getId());
            System.out.println("Nom : "+trader.getNom());
            System.out.println("Solde :"+trader.getSolde());
            System.out.println("Transactions :"+trader.getTransactions());

        }
    }

    public void Afiicher_Actif(){
        System.out.println("********* Les Actife **********");
        for(Asset a: assets){
            System.out.println("Code : "+a.getCode());
            System.out.println("Nome : "+a.getName());
            System.out.println("Prix : "+a.getPrice());
            System.out.println("Type : "+a.getType());
        }
    }
    public void  Afficher_Transactions(int trader){
        Trader found_Trader=null;
    for(Trader tra : traders){
        if(tra.getId()==trader){
            found_Trader = tra;
            break;
        }
        Trader finalFound_Trader = found_Trader;
        transactions.stream()
                .filter(t -> t.getTrader().equals(finalFound_Trader.getNom()))
                .forEach(System.out::println);
    }
        if (found_Trader == null) {
            System.out.println("Trader introuvable");
            return;
        }
    }

}
