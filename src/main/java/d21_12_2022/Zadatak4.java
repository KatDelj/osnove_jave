package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int broj = 0;
        System.out.println("Unesite X: ");
        int x = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            brojevi.add(broj);
        }
        for (int i = 0; i < n; i++) {

            if (x == brojevi.get(i)) {

                System.out.println("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: " + i);


            }
        }
    }

}