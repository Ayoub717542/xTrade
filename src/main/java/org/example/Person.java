package org.example;

public class Person {
    private int Id;
    private String Nom;

    public Person(int Id,String Nom){
        this.Id=Id;
        this.Nom=Nom;
    }

    public int getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }
}
