package d29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;


    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena +" dinara " + ", " + this.tezina + "g ");
    }
    public void povecajCenu(int povecanje){
        this.cena= this.cena + povecanje;
    }
    public double vratiCenusaPopustom (int popust){
        double cenaSaPopustom = this.cena;
        if (popust>0 && popust<100){
            cenaSaPopustom = this.cena- (this.cena*popust/100);
        }
        return cenaSaPopustom;

    }
    public double racunajPostarinu (){
       if (this.tezina <=0){
           return 0;
       }

        else if (this.tezina<=100) {
            return this.cena+200;
        }
        else if  (this.tezina>100 && this.tezina<=500 ){
            return this.cena + 400;
        }
        else {
            return this.cena+1000;



        }

    }






}

