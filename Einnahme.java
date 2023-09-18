package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Einnahme {
    private String name;
    private double betrag;

    public Einnahme(String name, double betrag){
        this.name = name;
        this.betrag = betrag;
    }

    public String getName(){
        return name;
    }

    public double getBetrag(){
        return betrag;
    }

}

class Ausgabe {
    private String name;
    private double betrag;

    public Ausgabe(String name,double betrag){
        this.name = name;
        this.betrag = betrag;
    }
    public String getName(){
        return name;
    }
    public double getBetrag(){
        return betrag;
    }
}



