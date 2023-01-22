package d19_01_2023;

//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
 //       kaucija za flasu
 //       atribut koji kaze da li se za flasu placa kaucija
 //       osnovna cena
 //       gettere i setter za atribute
 //       konstuktori koji su vam potrebni
  //      racuna cenu
//        ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//        ako se ne placa, (osnovna cena) * 1.2
//        metoda stampaj stampa sve podatke iz klase staklena flasa.

public class StaklenaAmbalaza extends Ambalaza {

    private int kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String artikl, int neto, int bruto, int kaucija, boolean placaSeKaucija, double osnovnaCena) {
        super(barkod, artikl, neto, bruto);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }


    @Override
    public double cena() {
        if (this.isPlacaSeKaucija()) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        }
        return this.osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.artikl);
        System.out.println("Neto tezina: " + this.neto);
        System.out.println("Bruto tezina: " + this.bruto);
        System.out.println("Cena: " + this.cena());
        if (this.isPlacaSeKaucija()) {
            System.out.println("Kaucija za flasu je " + this.kaucija + " dinara.");
        } else {
            System.out.println("Kaucija se ne placa.");


        }
    }
}

