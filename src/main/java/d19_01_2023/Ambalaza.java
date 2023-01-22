package d19_01_2023;
//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj
public abstract class Ambalaza {


 protected String barkod;
 protected String artikl;
 protected int neto;
 protected int bruto;

 public Ambalaza(){

 }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getArtikl() {
        return artikl;
    }

    public void setArtikl(String artikl) {
        this.artikl = artikl;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int getBruto() {
        return bruto;
    }

    public void setBruto(int bruto) {
        this.bruto = bruto;
    }



    public Ambalaza(String barkod, String artikl, int neto, int bruto) {
        this.barkod = barkod;
        this.artikl = artikl;
        this.neto = neto;
        this.bruto = bruto;
    }
    public double racunajTezinu(){
     return this.bruto-this.neto;

    }
    public abstract double cena();
    public abstract void stampaj();
}
