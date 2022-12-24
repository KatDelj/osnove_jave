package d20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    //Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
    // Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        String karakter="";
        int counter1=0;
        int counter2=0;

        while (!karakter.equals("=")) {
            System.out.print("Unos: ");
            karakter = s.next();

            if (karakter.equals("(")) {
                counter1++;
            }
            if (karakter.equals(")")) {
                counter2++;
            }
        }
              if(counter1==counter2) {
                 System.out.println("Zagrade su uparene.");
             }
              if (counter1>counter2 || counter2>counter1)  {
                  System.out.println("Zagrade nisu uparene.");
                 }


    }
}
