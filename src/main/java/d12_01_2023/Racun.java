package d12_01_2023;

public class Racun {
    private String brRacuna;
    private String imeIPrezime;
    private double trenutnoStanje;

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public Racun(String brRacuna, String imeIPrezime, double trenutnoStanje) {
        this.brRacuna = brRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public void promeniStanje(double promena){
        if (this.trenutnoStanje + promena<0){
            System.out.println("Nemoguce je izvrsiti transakciju.");
        }
        this.trenutnoStanje=trenutnoStanje+promena;

    }
    public void stampaj(){
        System.out.println(this.imeIPrezime +"-" + this.brRacuna);
        System.out.println("Stanje na racunu je " + trenutnoStanje + "rsd");
    }

}
