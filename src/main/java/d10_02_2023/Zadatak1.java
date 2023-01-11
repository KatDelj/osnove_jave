package d10_02_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Autor a=new Autor("Alber", "Kami");
        Knjiga k=new Knjiga("456-43543-45", "Stranac", 1942);

        Autor a1=new Autor("Gistav", "Flober");
        Knjiga k1=new Knjiga ("456-687-786", "Madam Bovari", 1856);

        Autor a2=new Autor("Onore", "de Balzak");
        Knjiga k2=new Knjiga("468-78687-75", "Čiča Gorio", 1835);

        k.setNapisaoJe(a);
        k.print();

        System.out.println();

        k1.setNapisaoJe(a1);
        k1.print();

        System.out.println();

        k2.setNapisaoJe(a2);
        k2.print();
    }
}
