package d13_01_2023;

import java.util.ArrayList;

public class Student {
    private int brIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> niz;

    public Student(int brIndeksa, String imeIPrezime, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.niz = new ArrayList<>();
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public void dodajIspit(Ispit ispit) {
        this.niz.add(ispit);
    }

    public double izracunajProsek() {
        int polozeniIspiti = 0;
        int oceneUkupno = 0;
        for (int i = 0; i < this.niz.size(); i++) {
            if (this.niz.get(i).jePolozen()) {
                polozeniIspiti++;
                oceneUkupno = oceneUkupno + this.niz.get(i).getOcena();
            }
        }
            return oceneUkupno / polozeniIspiti;

        }
        public void stampaj() {
            System.out.println(this.brIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
            System.out.println("Predmeti: ");
            for (int i = 0; i < this.niz.size(); i++) {
                System.out.println(this.niz.get(i).getPredmet() + " - " + this.niz.get(i).getProfesor() + " - " + this.niz.get(i).getOcena());

            }
            System.out.println("Prosecna ocena: " + izracunajProsek());
        }



}

