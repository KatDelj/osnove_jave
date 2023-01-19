package d16_01_2023;
 //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        // broj (broj koji igrac nosi)
       //   poziciju koju igra (odbrambeni, napadac, … )
       //   kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
      //default-ni konstuktor
      // konstuktor sa parametrima
     //   gettere i settere za broj, kapiten i poziciju
//  metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

public class Igrac extends Osoba {
    private int brDresa;
    private String poziija;
    private boolean jeKapiten;

    public Igrac(){

    }

    public Igrac(String imeIPrezime, String jmbg, int godRodjenja, int brDresa, String poziija, boolean jeKapiten) {
        super(imeIPrezime,jmbg, godRodjenja);
        this.brDresa=brDresa;
        this.poziija=poziija;
        this.jeKapiten=jeKapiten;

    }

    public int getBrDresa() {

        return brDresa;
    }

    public void setBrDresa(int brDresa) {
        this.brDresa = brDresa;
    }

    public String getPoziija() {

        return poziija;
    }

    public void setPoziija(String poziija) {

        this.poziija = poziija;
    }

    public boolean isJeKapiten() {

        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }
    @Override
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godRodjenja);
        System.out.println("Broj dresa: " + this.brDresa);
        System.out.println("Pozicija: " + this.poziija);
        if (this.isJeKapiten()){
            System.out.println("Igrac je kapiten.");
        }
        else {
            System.out.println();
        }

        ;

    }
}
