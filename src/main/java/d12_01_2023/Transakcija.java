package d12_01_2023;

public class Transakcija {
    private String id;
    private Racun posiljalac;
    private Racun primalac;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    public Transakcija(String id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }
    private double izracunajProviziju(double transakcija){
        if(transakcija<4500){
           return 45;
        }
        else{
            return transakcija*0.01;
        }

    }
    public void izvrsiTransakciju(double transakcija){
    this.posiljalac.promeniStanje(-transakcija - izracunajProviziju(transakcija));
    this.primalac.promeniStanje(transakcija);

    }
    public void stampaj(){
        System.out.println(this.id);
        System.out.println("Racun sa: " + this.posiljalac.getBrRacuna());
        System.out.println("Racun na: " +this.primalac.getBrRacuna());
    }
}
