package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BudgetVerwaltung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Einnahme> einnahmen = new ArrayList<>();
        ArrayList<Ausgabe> ausgaben = new ArrayList<>();
        double budget = 0;

        while (true) {
            System.out.println("1. Einnahme hinzufügen");
            System.out.println("2. Ausgabe hinzufügen");
            System.out.println("3. Budget anzeigen");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("name der Einnahme");
                    String einnahmeName = scanner.next();
                    System.out.println("Betrag:");
                    double einnahmeBetrag = scanner.nextDouble();
                    Einnahme einnahme = new Einnahme(einnahmeName, einnahmeBetrag);
                    einnahmen.add(einnahme);
                    budget += einnahmeBetrag;
                    break;
                case 2:
                    System.out.println("Name der Ausgabe:");
                    String ausgabeName = scanner.next();
                    System.out.println("Betrag:");
                    double ausgabeBetrag = scanner.nextDouble();
                    Ausgabe ausgabe = new Ausgabe(ausgabeName, ausgabeBetrag);
                    ausgaben.add(ausgabe);
                    budget -= ausgabeBetrag;
                    break;
                case 3:
                    System.out.println("Aktuelles Budget: " + budget);
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ungültige Auswahl.");
            }
        }

    }
}
