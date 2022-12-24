package d20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;

        while (counter1 < 3 && counter2 < 2) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 2) {
                counter2++;
            } else if (broj == 1) {
                counter1++;
            }
        }
        System.out.println("Kraj programa.");
        }
    }




