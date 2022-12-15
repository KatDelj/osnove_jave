package p14_12_2022.ScannerUvod;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Unesite a: ");
        double a = s.nextDouble();

        System.out.print("Unesite b: ");
        double b = s.nextDouble();

        System.out.print("Unestie c: ");
        double c = s.nextDouble();

        double avg = (a+b+c) /3;

        System.out.println("AVG" + avg);

    }
}
