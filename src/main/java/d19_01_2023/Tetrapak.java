package d19_01_2023;

public class Tetrapak extends Ambalaza{
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean recikliraSe;
    private double osnovnaCena;

    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public Tetrapak(String barkod, String artikl, int neto, int bruto, boolean recikliraSe, double osnovnaCena) {
        super(barkod, artikl, neto, bruto);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    @Override
    public double cena() {
        if (this.isRecikliraSe()){
            return this.racunajTezinu()*1.5 + osnovnaCena;
        }
        else{
           return this.osnovnaCena;
        }


    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.artikl);
        System.out.println("Neto tezina: " + this.neto);
        System.out.println("Bruto tezina: " + this.bruto);
        System.out.println("Cena: " + this.cena());
        if(this.isRecikliraSe())
        System.out.println("Ambalaža može da se reciklira.");
        else{
            System.out.println("Ambalaža ne može da se reciklira");
        }
        System.out.println("Cena proizvoda je " + this.cena() + " dinara.");

    }
}
