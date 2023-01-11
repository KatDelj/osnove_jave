package d10_02_2023;

public class Knjiga {

    private String ISBN;
    private String naziv;
    private int godIzdanja;

    private Autor napisaoJe;

    public Knjiga(String ISBN, String naziv, int godIzdanja) {
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godIzdanja = godIzdanja;

    }

    public Knjiga(String ISBN, String naziv, int godIzdanja, Autor napisaoJe) {
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godIzdanja = godIzdanja;
        this.napisaoJe = napisaoJe;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }

    public void setNapisaoJe(Autor napisaoJe) {
        this.napisaoJe = napisaoJe;
    }

    public void print(){
        System.out.println(this.ISBN );
        System.out.println(this.naziv + " - " + this.godIzdanja);
        System.out.println("Autor: "  + this.napisaoJe.getIme() +  " " + this.napisaoJe.getPrezime());


    }
}
