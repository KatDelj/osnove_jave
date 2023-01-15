package d12_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        //U glavnoj klasi:
        //kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
        ArrayList<ZeleniKarton>niz= new ArrayList<ZeleniKarton>();

            ZeleniKarton zk1=new ZeleniKarton("Marko Markovic", "45", "Rimsko pravo",
                    "Petar Petrovic", 9);
            niz.add(zk1);
            ZeleniKarton zk2=new ZeleniKarton("Trajko Trajkovic", "45", "Ustavno pravo",
                    "Petar Petrovic", 10);
            niz.add(zk2);
            ZeleniKarton zk3=new ZeleniKarton("Jovan Jovnovic", "45", "Retorika",
                    "Petar Petrovic", 6);
            niz.add(zk3);
        ZeleniKarton zk4=new ZeleniKarton("Toma Tomic", "45", "Pravna etika",
                "Petar Petrovic", 10);
        niz.add(zk1);
        ZeleniKarton zk5=new ZeleniKarton("Petar Petrovic", "45", "Rimsko pravo",
                "Petar Petrovic", 6);
        niz.add(zk2);
        ZeleniKarton zk6=new ZeleniKarton("Jovan Jovnovic", "45", "Rimsko pravo",
                "Petar Petrovic", 7);
        niz.add(zk3);
        ZeleniKarton zk7=new ZeleniKarton("Ana Anic", "45", "Ljudska prava",
                "Petar Petrovic", 7);
        niz.add(zk1);
        ZeleniKarton zk8=new ZeleniKarton("Petar Petrovic", "45", "Retorika",
                "Petar Petrovic", 10);
        niz.add(zk2);
        ZeleniKarton zk9=new ZeleniKarton("Jovan Jovnovic", "45", "Rimsko pravo",
                "Petar Petrovic", 10);
        niz.add(zk3);
        ZeleniKarton zk10=new ZeleniKarton("Marko Markovic", "45", "Rimsko pravo",
                "Petar Petrovic", 6);
        niz.add(zk1);
        ZeleniKarton zk11=new ZeleniKarton("Radovan Radovanovic", "45", "Ustavo pravo",
                "Petar Petrovic", 7);
        niz.add(zk2);
        ZeleniKarton zk12=new ZeleniKarton("Jovan Jovnovic", "45", "Ljudska prava",
                "Petar Petrovic", 9);
        niz.add(zk3);



        for (int i = 0; i < niz.size(); i++) {
            niz.get(i).stampaj();


        }

    }
}
