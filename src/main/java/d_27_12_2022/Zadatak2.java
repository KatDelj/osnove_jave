package d_27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

        SmartAirConditioning klima1=new SmartAirConditioning();
        klima1.marka="Samsung";
        klima1.temperatura= 21;
        klima1.mode="greje";

        klima1.stampaj();


        SmartAirConditioning klima2=new SmartAirConditioning();
        klima2.marka="Galanz";
        klima2.temperatura= 18;
        klima2.mode="hladi";

        klima2.stampaj();

      if (klima1.daLiJeNapoljuVisaTemeperatura(30)){
          System.out.println("Napolju je temeperatura  viša od podesene temeperature");
      }
      else {
          System.out.println("Napolju je temperatura  niža od podesene.");
      }
      if (klima2.daLiJeNapoljuVisaTemeperatura(5)){
            System.out.println("Napolju je temeperatura niža od podešene.");
        }
      else {
            System.out.println("Napolju je temeperatura  viša od podesene temeperature.");
        }




    }
}
