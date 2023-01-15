package d12_01_2023;

public class ZeleniKarton {
    private String student;
    private String brIndeksa;
    private String predmet;
    private String profesor;
    private int ocena;

    public ZeleniKarton(String student, String brIndeksa, String predmet, String profesor, int ocena) {
        this.student = student;
        this.brIndeksa = brIndeksa;
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean jePolozioIspit(){
        if (ocena>5){
            return true;
        }
       return false;
    }
    public void stampaj(){
        System.out.println(this.predmet + "-" + this.ocena);
        System.out.println("Student: " + this.student + ", " + this.brIndeksa);
        System.out.println("Profesor: " + this.profesor);
        System.out.println();
    }
}
