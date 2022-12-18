package d14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a= s.nextInt();

        System.out.println("Unesite b: ");
        int b= s.nextInt();
                if (b==2) {
                    System.out.println("Nova vrednost za a je: " + (a-20));

                }
                else if (b==1) {
                    System.out.println("Nova vrednost za a je: " + (a+10));
                }


    }
}
