package d14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Uneti ime: ");
        String ime = s.next();

        System.out.println("Uneti prezime: ");
        String prezime = s.next();

        System.out.println("Uneti godinu rođenja: ");
        int godinaRodjenja = s.nextInt();

        int starost = 2022 - godinaRodjenja;

        if (ime.equals("Milan") && prezime.equals("Jovanovic")) {
            System.out.println(ime + " " +  prezime +" - " + starost + " " + "god");
        }


    }


}
