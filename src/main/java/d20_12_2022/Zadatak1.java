package d20_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    //Napisati program koji ucitava brojeve od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.Unesite broj: 3
    //Apsolutna vrednost je 3
    //Unesite broj: -1
    //Apsolutna vrednost je 1
    //Unesite broj: 0
    //Kraj programa jer je uneta nula.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int broj=1;

        while (broj != 0) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj > 0) {

                System.out.println("Apsolutna vrednost je: " + broj);
            }
            else if (broj < 0) {
                int apsolutnaVrednost= broj*(-1);
                System.out.println("Apsolutna vrednost je: " + apsolutnaVrednost);

            }

        }
        System.out.println("Kraj programa jer je uneta nula.");

    }
}
