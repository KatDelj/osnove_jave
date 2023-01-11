package d10_01_2023;

public class Kupac {

    private String imeIprezime;
    private ClanskaKarta podaci;

    public Kupac(){

    }

    public Kupac(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }


    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public ClanskaKarta getPodaci() {
        return podaci;
    }

    public void setPodaci(ClanskaKarta podaci) {
        this.podaci = podaci;
    }

    public void stampaj() {
        System.out.println(this.imeIprezime + "-" + this.podaci.getBrKartice());

    }

    public double popust() {

        double popust = this.podaci.getPopust();
        return popust;
    }

}


