package d19_01_2023;
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

import java.util.ArrayList;
import java.util.Objects;

public class Korpa {
    private ArrayList<Ambalaza>ambalaze;

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }
    public Korpa(){
        this.ambalaze=new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza ambalaza){

        this.ambalaze.add(ambalaza);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i <this.ambalaze.size() ; i++) {
            if (this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
            }
    private double cenaSaPopustom(int popust){
        double suma=0;
        for (int i = 0; i <this.ambalaze.size() ; i++) {
            suma=suma+this.ambalaze.get(i).cena();

        }
        return suma - popust;
    }
    public double cenaKorpe(SuperKartica superKartica){
        double ukupnaCena=0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            ukupnaCena=ukupnaCena+this.ambalaze.get(i).cena();

        }
        return ukupnaCena- superKartica.getPopust();
    }




       }


