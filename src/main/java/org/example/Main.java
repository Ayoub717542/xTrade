package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args){
       TradingPlatform trading = new TradingPlatform();
       Asset A = new Asset(343,"string",34.4,"Crypto");
       trading.ajouter_Actif(A);
       trading.Afiicher_Actif();
       Portfolio<Asset> P = new Portfolio<>();
       Trader t = new Trader(1,"ayoub",29989.2,P);
       P.Ajouter_Asset_to_portoflio(A,33.4);
       trading.ajouter_Trader(t);
       t.Acheter_Actif(A,3.3);
       t.Afficher_Portfolio();
       trading.Afficher_Trader();
    }
}
