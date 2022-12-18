package d14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite operator: ");
        String x = s.next();

        if (x.equals("-")) {
            System.out.println("Rezultat: " + (a - b));
        }
        else if (x.equals("*")) {
            System.out.println("Rezultat: " + (a * b));
        }
        else if (x.equals("+")) {
            System.out.println("Rezultat: " + (a + b));
        }
        else if (x.equals("/")) {
            System.out.println("Rezultat: " + (a / b));
        }
    }
}
