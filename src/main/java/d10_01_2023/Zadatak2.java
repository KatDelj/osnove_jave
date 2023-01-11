package d10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Proizvod p = new Proizvod("Slika", 20000);

        ClanskaKarta c = new ClanskaKarta(5, 75320244);

        Kupac k = new Kupac("Marko Markovic");
        k.setPodaci(c);
        k.stampaj();
        p.setJeKupac(k);
        p.stampaj();



    }
}
