package p13_12_2022;

import org.w3c.dom.ls.LSOutput;

public class Zadatak2 {
    //Napisati program koji na ekranu stampa podatke u formatu:
    //Sifra [SIFRA PROIZVODA]
    //[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
    //[BOJA], [VELICINA]
    public static void main(String[] args) {
        String SifraProizvoda = "5685crf";
                String nazivProizvoda = "Patike";
                int cenaProizvoda = 90;
                double popustProizvoda = 13.5;
                String bojaProizvoda = "bela";
                double velicinaProizvoda = 46.5;

        System.out.println("Sifra" + "sifraProizvoda");
        System.out.println(nazivProizvoda + " -$" + cenaProizvoda + " - Popust " +popustProizvoda + "%");
        System.out.println(bojaProizvoda + " , " + velicinaProizvoda);


    }
}
