package d17_01_2023;
//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
public class Zadatak1 {
    public static void main(String[] args) {

        VideoPlayer vp=new VideoPlayer(25, 10, 53, 261);
        TimeControl tc=new TimeControl(true);
        AudioControl ac=new AudioControl(true);
        QualityOptimizerControl qc=new QualityOptimizerControl(21);


        tc.izvrsiAkciju(vp);
        ac.izvrsiAkciju(vp);
        qc.izvrsiAkciju(vp);
        vp.stampaj();

    }
}
