package d10_01_2023;

public class ClanskaKarta {

    private double popust;
    private int brKartice;

    public ClanskaKarta(double popust, int brKartice) {
        this.popust = popust;
        this.brKartice = brKartice;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public int getBrKartice() {
        return brKartice;
    }

    public void setBrKartice(int brKartice) {
        this.brKartice = brKartice;
    }


}
