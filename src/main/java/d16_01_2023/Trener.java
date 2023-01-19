package d16_01_2023;
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
public class Trener extends Osoba {
    private int godIskustva;
    private String tipTrenera;

    public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godRodjenja);
        System.out.println("Godine iskustva: " + this.godIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
    }
}
