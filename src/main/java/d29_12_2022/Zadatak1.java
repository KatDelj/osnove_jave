package d29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod proizvod1= new Proizvod();
        proizvod1.naziv="Kafa";
        proizvod1.cena=311;
        proizvod1.tezina=400;

        proizvod1.stampaj();
        proizvod1.povecajCenu(64);
        proizvod1.stampaj();
        System.out.println("Cena proizvoda sa popustom je " + proizvod1.vratiCenusaPopustom(20));
        System.out.println("Cena proizvoda sa poštarinom je " + proizvod1.racunajPostarinu());


        Proizvod proizvod2= new Proizvod();
        proizvod2.naziv= "Puter";
        proizvod2.cena=209;
        proizvod2.tezina=100;

        proizvod2.stampaj();
        proizvod2.povecajCenu(25);
        proizvod2.stampaj();
        System.out.println("Cena proizvoda sa popustom je " + proizvod2.vratiCenusaPopustom(80));
        System.out.println("Cena proizvoda sa poštarinom je " + proizvod2.racunajPostarinu());







    }
}
