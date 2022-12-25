package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
   //Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
        //Primer:
        //Unesite pozicjiu od 0 do 9: 3
        //Unesite novu vrednost: 11
        //Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer>brojevi=new ArrayList<Integer>();
        brojevi.add(14);
        brojevi.add(223);
        brojevi.add(1);
        brojevi.add(6);
        brojevi.add(15);
        brojevi.add(250);
        brojevi.add(499);
        brojevi.add(72);
        brojevi.add(11);
        brojevi.add(3);
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite poziciju od 0 do 9: ");
        int k=s.nextInt();
        System.out.println("Unesite novu vrednost: ");
        int n=s.nextInt();

        brojevi.set(k,n);

    }
}
