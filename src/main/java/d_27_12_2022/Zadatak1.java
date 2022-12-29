package d_27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {


        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Cokolada";
        proizvod1.cena = 55.5;
        proizvod1.tezina = 150;
        proizvod1.stampaj();

        proizvod1.stampaj();
        System.out.println("Konvertovanje: " + proizvod1.konvertuj("kg") + "kg");

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Secer";
        proizvod2.cena = 35;
        proizvod2.tezina = 1000;

        proizvod2.stampaj();
        System.out.println("Konvertovanje: "+ proizvod2.konvertuj("t") + "t");
    }
}