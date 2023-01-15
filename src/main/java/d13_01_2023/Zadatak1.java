package d13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student student1=new Student(75, "Bosko Boskovic", "Osnovne studije");

        Ispit polaganje1=new Ispit("Semantika i pragmatika", 6, "Petar Petrovic" );
        Ispit polaganje2=new Ispit("Didaktika", 10, "Marko Markovic");
        Ispit polaganje3=new Ispit("Pedagogija", 10, "Mita Mitic");
        Ispit polaganje4=new Ispit("Grcki jezik", 7, "Pera Peric");

        student1.dodajIspit(polaganje1);
        student1.dodajIspit(polaganje2);
        student1.dodajIspit(polaganje3);
        student1.dodajIspit(polaganje4);
        student1.stampaj();


    }
}
