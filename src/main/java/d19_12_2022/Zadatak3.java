package d19_12_2022;

import javax.swing.*;
import java.util.Scanner;

public class Zadatak3 {
    // Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
    //ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
    //ako se ne sadrzi, program dostampa na kraju
    //	Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");

        int n = s.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite rec: ");
            String rec = s.next();

            if (rec.contains("!")) {
                System.out.println(rec);
                suma = suma + 1;
            } else {
                System.out.println(rec + "!");
            }

        }

        int procenat= suma*100/n;
        System.out.println("Nivo agresivnosti je: "+ procenat + "%");

    }
}