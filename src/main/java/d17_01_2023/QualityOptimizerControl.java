package d17_01_2023;
//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//gettere, settere i konstruktore
//implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
// Kvalitet se racuna na osnovu formule:brzina interneta * 10.1, gde se uzima prvi veci kvalitet
public class QualityOptimizerControl extends Control{

    private int brzinaNeta;

    public QualityOptimizerControl(int brzinaNeta){
        this.brzinaNeta=brzinaNeta;
    }

    public int getBrzinaNeta() {
        return brzinaNeta;
    }

    public void setBrzinaNeta(int brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {
       double kvalitetVidea=this.brzinaNeta*10-1;
       if (kvalitetVidea<=144){

            vp.setKvalitet(144);
       }
       else if (kvalitetVidea<=240){
           vp.setKvalitet(240);
       }
       else if (kvalitetVidea<=720){
          vp.setKvalitet(720);
       }

    }
}
