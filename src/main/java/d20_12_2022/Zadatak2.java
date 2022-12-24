package d20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    //Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rimskiBroj = "";
        while (!rimskiBroj.equals ("Kraj")) {
            System.out.println("Unesite rimski broj: ");
            rimskiBroj = s.next();
            if (rimskiBroj.equals("X")) {
                System.out.println("Arapski broj: " + "10");
            } else if (rimskiBroj.equals("V")) {
                System.out.println("Arapski broj: " + "5");
            } else if (rimskiBroj.equals("M")) {
                System.out.println("Arapski broj: " + "1000");
            } else if (rimskiBroj.equals("D")) {
                System.out.println("Arapski broj: " + "500");
            } else if (rimskiBroj.equals("I")) {
                System.out.println("Arapski broj: " + "1");}




                }
            System.out.println("Kraj programa");
            }
        }


















