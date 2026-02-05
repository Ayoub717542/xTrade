package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
                public class Main {
                   public static void main(String[] args){
                       TradingPlatform trading = new TradingPlatform();
                       Trader t = new Trader();
                       Scanner scanner= new Scanner(System.in);
                       int choice ;
                       do {
                           try {
                               System.out.println("===== X-Trading Platform =====");
                               System.out.println("     ===== Admin Menu =====     ");
                               System.out.println("1.  Ajouter un Trader");
                               System.out.println("2.  Ajouter un Actif (Action / Crypto)");
                               System.out.println("3.  Afficher le Portefeuille");
                               System.out.println("4.  Afficher les Traider");
                               System.out.println("5.  Afficher les Transactions ");
                               System.out.println("6.  Afficher les Actif");
                               System.out.println("     ===== Client Menu =====     ");
                               System.out.println("7.  Acheter un Actif");
                               System.out.println("8.  Vendre un Actif");
                               System.out.println("0.  Quitter");
                               System.out.print("Entrez votre choix : ");
                               choice = scanner.nextInt();
                               switch (choice){
                                   case 1:
                                       System.out.println("Entre ID trader :");
                                       int id= Integer.parseInt(scanner.next());
                                       System.out.println("Entre Nom :");
                                       String nom=scanner.next();
                                       System.out.println("Entre Solde");
                                       double sold = scanner.nextDouble();
                                       Portfolio<Asset> P = new Portfolio<>();
                                       Trader trader = new Trader(id,nom,sold,P);
                                       trading.ajouter_Trader(trader);
                                       break;
                                   case 2:
                                       System.out.println("Entre le type de Actif (Stock / Crypto): ");
                                       System.out.println("1. Stock");
                                       System.out.println("2. Crypto");
                                       int choix=scanner.nextInt();
                                       System.out.println("Entre Code Actif :");
                                       int code= Integer.parseInt(scanner.next());
                                       System.out.println("Entre Nom :");
                                       String nom_actif=scanner.next();
                                       System.out.println("Entre Prix");
                                       double prix = scanner.nextDouble();
                                       String type="";
                                       if(choix == 1){
                                           type="Stock";
                                       }else if(choix == 2){
                                           type="Crypto";
                                       }
                                       Asset A = new Asset(code,nom_actif,prix,type);
                                       trading.ajouter_Actif(A);
                                       break;
                                   case 3:
                                       System.out.println("les Portefeuille :");
                                       t.Afficher_Portfolio();
                                       break;
                                   case 4:
                                       System.out.println("Les Traiders :");
                                       trading.Afficher_Trader();
                                       break;
                                   case 5:
                                       System.out.println("Entre le trader ID");
                                       int trader_ID=scanner.nextInt();
                                       System.out.println("les Transaction de cette Trader est :\n");
                                       trading.Afficher_Transactions(trader_ID);
                                       break;
                                   case 6 :
                                       System.out.println("Les Actif : ");
                                       trading.Afiicher_Actif();
                                       break;
                                   case 7:
                                       System.out.println("Entre Trader Id : ");
                                       int trader_id= scanner.nextInt();
                                       Trader traderTrouve = null;
                                       for(Trader tr: trading.traders){
                                           if(trader_id == tr.getId()){
                                               traderTrouve = tr;
                                               break;
                                           }
                                       }
                                       if(traderTrouve == null){
                                           System.out.println("Trader introuvable");
                                           break;
                                       }
                                       System.out.println("Choisir le type d’actif :");
                                       System.out.println("1 - Stock");
                                       System.out.println("2 - Crypto");
                                       int type_actif=scanner.nextInt();
                                       System.out.println("Entre le nom de Actif");
                                       String actif_nom=scanner.next();
                                       Asset actif=null;
                                       if(type_actif==1){
                                           actif=new Stock(1,actif_nom);
                                       }else if(type_actif == 2){
                                           actif= new CryptoCurrency(2,actif_nom);
                                       }
                                       System.out.println("Enter la Quantité : ");
                                       double actif_quantite = scanner.nextDouble();
                                       traderTrouve.Acheter_Actif(actif,actif_quantite);
                                       break;
                                   case  0:
                                       break;
                               }
           }catch (InputMismatchException e){
               System.out.println("invalid input");
               scanner.nextLine();
               choice=-1;
           }

    }while (choice!=0);
       scanner.close();
}
}
