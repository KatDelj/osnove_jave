package p14_12_2022.ScannerUvod;

import java.util.Scanner;

public class ScannerUvod {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
                int a = s.nextInt();


        System.out.println("Unesite b: ");
        int b = s.nextInt();
        int sum = a + b;

        System.out.println( "Suma " + a + "+" + b + "=" + sum);



    }
}
