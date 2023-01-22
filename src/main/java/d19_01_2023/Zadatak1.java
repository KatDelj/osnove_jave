package d19_01_2023;
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza
// razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
public class Zadatak1 {
    public static void main(String[] args) {

        Korpa k=new Korpa();
        Tetrapak t=new Tetrapak("45632254", "Sok", 400, 420,false,110 );
        Tetrapak t1=new Tetrapak("5454645", "Jogurt", 200, 240, false, 55);
        StaklenaAmbalaza sa=new StaklenaAmbalaza("54646", "Voda", 250, 300,100, true, 200);

        k.dodajAmbalazu(t);
        k.dodajAmbalazu(t1);
        k.dodajAmbalazu(sa);

        SuperKartica sk=new SuperKartica(214, "Petra Petrovic", 15);


        t.stampaj();
        t1.stampaj();
        sa.stampaj();
        k.izbaciAmbalazu("5454645");


        System.out.println("Ukupna cena korpe sa popustom je : " + k.cenaKorpe(sk));

    }
}
