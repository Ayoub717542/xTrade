package org.example;

public class Asset {
    private int code;
    private String name;
    private double price ;
    private String type;

    public Asset(int code, String name,double price,String type){
        this.code=code;
        this.name=name;
        this.price=price;
        this.type=type;
    }
    public int getCode() {return code;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public String getType() {return type;}
}
