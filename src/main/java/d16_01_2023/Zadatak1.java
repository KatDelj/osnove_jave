package d16_01_2023;
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
public class Zadatak1 {
    public static void main(String[] args) {
        Igrac i1=new Igrac("Marko Markovic", "45854175", 1990, 25, "napadac", true);
        Trener t1=new Trener("Jovan Jovanovic", "25896412", 1972, 14, "pomocni trener");
        Igrac i2=new Igrac("Stojan Stojanovic", "465768687", 2000, 7, "golman", false);
        Trener t2=new Trener("Milan Milanovic", "8647684", 1960, 27, "kondicioni trener");
        i1.stampaj();i2.stampaj();
        System.out.println();
        t1.stampaj();t2.stampaj();

    }
}
