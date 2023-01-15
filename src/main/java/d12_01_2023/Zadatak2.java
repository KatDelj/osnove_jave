package d12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Racun racun1=new Racun("741-455735651-27", "Laza Lazic", 30000);
        Racun racun2=new Racun("741-572458964-27", "Mira Miric", 10000);

        Transakcija prenos=new Transakcija("54", racun1,racun2);


      prenos.izvrsiTransakciju(500);
      prenos.stampaj();

      racun1.stampaj();
      racun2.stampaj();


    }
}
