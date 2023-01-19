package d17_01_2023;
//Kreirati klasu TimeControl koja nasledjuje klasu Control i
//konstruktore
//ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa.
// Veoma je bitno da se ne izadje van granica videa.
public class TimeControl extends Control {

    private boolean napred;


    public TimeControl(){

    }

    public TimeControl(boolean napred) {
        this.napred = napred;
    }

    public boolean isNapred() {
        return napred;
    }

    public void setNapred(boolean napred) {
        this.napred = napred;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {
     if(this.isNapred()){
         vp.setTrenutnoVreme(vp.getTrenutnoVreme()+15);

     }
     else {
         vp.setTrenutnoVreme(vp.getTrenutnoVreme()-15);
     }
     if (vp.getTrenutnoVreme()>vp.getDuzina()){
         vp.setTrenutnoVreme(vp.getDuzina());
     }
     else if (vp.getTrenutnoVreme()<0){
         vp.setTrenutnoVreme(0);
     }



}
}
