package d26_12_2022;

public class Zadatak1 {
    //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
    // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
    public static void main(String[] args) {
    stampajVrednostZa10Vecu(5);
    stampajVrednostZa10Vecu(542);
    stampajVrednostZa10Vecu(1);
    stampajVrednostZa10Vecu(16);
    stampajVrednostZa10Vecu(35);


    }
    public static void stampajVrednostZa10Vecu(int a){
       a= 10+a;
        System.out.println("Vrednost za 10 veca: " + a);


    }

}
