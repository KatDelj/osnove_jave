package p14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite  ime: ");
        String ime= s.next();

        System.out.println("Unesite  prezime:  ");
        String prezime= s.next();

        System.out.println("Unesite  email: ");
        String email= s.next();

        System.out.println("IUnesite  jmbg: ");
        String jmbg= s.next();

        System.out.println("IUnesite  brojTelefona;: ");
        String brojTelefona= s.next();

        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj Telefona: "  + brojTelefona);
        System.out.println("Email: " + email);







    }
}
