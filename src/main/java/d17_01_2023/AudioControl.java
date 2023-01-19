package d17_01_2023;
//Kreirati klasu AudioControl koja nasledjuje klasu Control i
//gettere, settere i konstruktore
//ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
public class AudioControl extends Control {

    private boolean pojacava;
    public AudioControl(boolean pojacava){
        this.pojacava=pojacava;
    }



    public boolean isPojacava() {
        return pojacava;
    }

    public void setPojacava(boolean pojacava) {
        this.pojacava = pojacava;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {

        if (this.isPojacava()) {
           vp.setJacina(vp.getJacina()+1);
        } else {
            vp.setJacina(vp.getJacina()-1);
        }
        if (vp.getJacina() < 0) {
            vp.setJacina(0);
        } else if (vp.getJacina() > 100) {
            vp.setJacina(100);
        }
    }
}
