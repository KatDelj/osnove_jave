package d26_12_2022;

public class Zadatak4 {
    //Napisati metodu koja stampa podatke o korisniku u formatu:
    //JMBG: [jmbg]
    //Ime: [ime]
    //Prezime: [prezime]
    //God. rodjenja: [god]
    //Aktivan: [true/false]
    //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
    public static void main(String[] args) {
        korisnik("06098535", "Jovan", "Jovanovic", "1960", true );


    }

    public static void korisnik(String jmbg, String ime, String prezime, String godinaRodjenja, boolean daLiJeAktivan){
        System.out.println("JMBG: "+ jmbg );
        System.out.println("Ime: "+ ime );
        System.out.println("Prezime: "+ prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + daLiJeAktivan);

    }







}


