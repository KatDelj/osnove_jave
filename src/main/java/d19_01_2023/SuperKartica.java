package d19_01_2023;

//Kreirati klasu SuperKartica koja ima:
//        broj kartice
//        ime i prezime vlasnika
 //       popust (200, 500, … )
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu stampaj koja stampa karticu u formatu:
//        (broj kartice), (ime i prezime)

public class SuperKartica {
    private int brKartice;
    private String imeIPrezime;
    private double popust;
    public SuperKartica(){

    }

    public SuperKartica(int brKartice, String imeIPrezime, double popust) {
        this.brKartice = brKartice;
        this.imeIPrezime = imeIPrezime;
        this.popust = popust;
    }

    public int getBrKartice() {
        return brKartice;
    }

    public void setBrKartice(int brKartice) {
        this.brKartice = brKartice;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void stampajKarticu(){
        System.out.println(this.brKartice + ", " + this.imeIPrezime);
    }
}
