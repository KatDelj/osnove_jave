package d14_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x: ");
        int x = s.nextInt();
        int y=0;
        if (x<2) {
            y=2;
        }
        else if (x>=2 && x<10) {
            y=2;
        }
        else if (x>=10) {
            y=x-1;
        }
        System.out.println("y = " + y);
    }
}
