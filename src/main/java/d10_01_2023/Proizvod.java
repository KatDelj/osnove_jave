package d10_01_2023;

public class Proizvod {

    private String naziv;
    private double cenaIzrade;
    private Kupac jeKupac;


    public Proizvod(String naziv, int cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac getJeKupac() {
        return jeKupac;
    }

    public void setJeKupac(Kupac jeKupac) {
        this.jeKupac = jeKupac;
    }

    public double racunajCenuProizvoda(){
        return this.cenaIzrade * 9*(100-this.jeKupac.popust())/100;
    }
    public void stampaj (){
        System.out.println(this.naziv + "-" + this.racunajCenuProizvoda());
        System.out.println(this.jeKupac.getImeIprezime() + "-" + this.jeKupac.getPodaci().getBrKartice());
    }
}

