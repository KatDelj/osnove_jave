package d19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    // Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
    //Program podrzava sledece reakcije:
    //like
    //smile
    //heart
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n=s.nextInt();
        int counter1=0;
        int counter2=0;
        int counter3=0;
        for (int i = 1; i<=n ; i++) {
            System.out.println("Reaguj: ");
            String reakcija=s.next();
            if (reakcija.equals("like")){
                counter1 =counter1 + 1;

            } if (reakcija.equals("smile")) {
                counter2 =counter2+1;

            }

            if (reakcija.equals("heart")) {
                counter3 =counter3+1;
            }

        }
        System.out.println("Summary: " + "like "+counter1+ " |"+ " smile "+ counter2 +" |" + " heart " + counter3);

    }
}
