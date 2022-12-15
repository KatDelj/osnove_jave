package p14_12_2022.ScannerUvod;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int  a = s.nextInt();
        System.out.println("Unesite b: ");
        int b= s.nextInt();
        if (b<a)  {
            System.out.println("B je manje od A");
        }
    }
}
