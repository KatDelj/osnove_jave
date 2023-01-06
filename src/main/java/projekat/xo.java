package projekat;

import java.util.Scanner;

public class xo {
    public static void main(String[] args) {
        XOTabla tabla=new XOTabla();
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite ime igraca X: ");
        tabla.setImeXigraca(s.next());
        System.out.print("Unesite ime igraca O: ");
        tabla.setImeOigraca(s.next());

        tabla.pokreniIgru();
        while(tabla.pobednikX()==false && tabla.pobednik0()==false && tabla.popunjenaTabla()==false){
            tabla.stampaj();
            System.out.println("Na potezu igrac : " + tabla.getNaPotezu());
            System.out.print("Odigraj potez: ");
            int potez=s.nextInt();

            if (tabla.poljePrazno(potez)){
                tabla.odigrajPotez(potez);
                tabla.zameniIgraca();
            }
            else {
                System.out.println("Potez nije validan");
            }

        }
        tabla.stampaj();

        if (tabla.pobednikX()){
            System.out.print("Pobednik je " + tabla.getImeXigraca());
        }
        else if (tabla.pobednik0()){
            System.out.print("Pobednik je " + tabla.getImeOigraca());
        }
        else {
            System.out.println("Rezultat je nerešen");
        }
    }
}
