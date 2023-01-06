package projekat;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXigraca;
    private String imeOigraca;
    private String naPotezu;


    public String getImeXigraca() {
        return this.imeXigraca;
    }

    public String getImeOigraca() {
        return this.imeOigraca;
    }

    public String getNaPotezu() {
        return this.naPotezu;
    }

    public void setImeXigraca(String imeXIgraca) {
        this.imeXigraca = imeXIgraca;


    }

    public void setImeOigraca(String imeOIgraca) {
        this.imeOigraca = imeOIgraca;
    }

    public void pokreniIgru() {
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        this.naPotezu = "X";
    }

    public void stampaj() {
        System.out.println(polje1 + " | " + polje2 + " | " + polje3);
        System.out.println(polje4 + " | " + polje5 + " | " + polje6);
        System.out.println(polje7 + " | " + polje8 + " | " + polje9);
        System.out.println("Igrac X: " + imeXigraca);
        System.out.println("Igrac O: " + imeOigraca);
    }
    //poljePrazno - metoda kao parametar prima broj polja (indeks polja) i vraca da li je polje slobodno. Polje je slobodno ako se u trazenom polju nalazi razmak.
    //(Za primer sa slike iz metode stampaj) Ako se pozove metoda za broj polja 1 vraca false.
    //(Za primer sa slike iz metode stampaj) Ako se pozove metoda za broj polja 2 vraca true.

    public boolean poljePrazno(int brPolja) {
        if (brPolja ==1) {
            if (this.polje1.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==2) {
            if (this.polje2.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==3) {
            if (this.polje3.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==4) {
            if (this.polje4.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==5) {
            if (this.polje5.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==5) {
            if (this.polje5.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==6) {
            if (this.polje6.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==7) {
            if (this.polje7.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==8) {
            if (this.polje8.equals(" ")) {
                return true;
            }
        }
        if (brPolja ==9) {
            if (this.polje9.equals(" ")) {
                return true;
            }
        }
        return false;
    }

    //zameniIgraca - metoda nema dodatnih parametara. Metoda utice na stanje objekta tako sto menja
    // informaciju ko igra sledeci.
    // Ako je na potezu bio X, metoda postavlja da je sledeci na potezu O i obrnuto.
    public void zameniIgraca() {

        if (this.naPotezu.equals("X")) {
            this.naPotezu = "O";
        } else {
            this.naPotezu = "X";
        }

    }

    //odigrajPotez - metoda ima samo jedan parametar, parametar je broj polja za koje korisnik hoce da
    // odigra potez.
    // Na trazeno polje se upisuje vrednost igraca koji je na potezu.
    public void odigrajPotez(int brPolja) {

        String igrac;

        if (this.naPotezu.equals("X")) {
            igrac = "X";
        } else {
            igrac = "O";
        }
        if (brPolja == 1) {
            this.polje1 = igrac;
        } else if (brPolja == 2) {
            this.polje2 = igrac;
        } else if (brPolja == 3) {
            this.polje3 = igrac;
        } else if (brPolja == 4) {
            this.polje4 = igrac;
        } else if (brPolja == 5) {
            this.polje5 = igrac;
        } else if (brPolja == 6) {
            this.polje6 = igrac;
        } else if (brPolja == 7) {
            this.polje7 = igrac;
        } else if (brPolja == 8) {
            this.polje8 = igrac;
        } else if (brPolja == 9) {
            this.polje9 = igrac;
        }
    }

    //popunjenaTabla - metoda vraca da li je tabla popunjena. Tabla je popunjena ukoliko nijedno polje na tabli
    // nije prazno.
    // Metoda vraca true ako jeste popunjena i false ako nije.
    public boolean popunjenaTabla() {

        if (polje1.equals(" ") || polje2.equals(" ") || polje3.equals(" ") || polje4.equals(" ")
                || polje5.equals(" ") || polje6.equals(" ") || polje7.equals(" ") || polje8.equals(" ") ||
                polje9.equals(" ")) {
            return false;
        } else {
            return true;
        }
    }
    public boolean pobednikX() {
        if (polje1.equals("X") && polje2.equals("X") && polje3.equals("X")) {
            return true;
        } else if (polje4.equals("X") && polje5.equals("X") && polje6.equals("X")) {
            return true;
        } else if (polje7.equals("X") && polje8.equals("X") && polje9.equals("X")) {
            return true;

        } else if (polje1.equals("X") && polje4.equals("X") && polje7.equals("X")) {
            return true;
        } else if (polje2.equals("X") && polje5.equals("X") && polje8.equals("X")) {
            return true;

        } else if (polje3.equals("X") && polje6.equals("X") && polje9.equals("X")) {
            return true;
        } else if (polje1.equals("X") && polje5.equals("X") && polje9.equals("X")) {
            return true;
        } else if (polje3.equals("X") && polje5.equals("X") && polje7.equals("X")) {
            return true;
        } else {
            return false;
        }
    }

        public boolean pobednik0() {
            if (polje1.equals("O") && polje2.equals("O") && polje3.equals("O")) {
                return true;
            } else if (polje4.equals("O") && polje5.equals("O") && polje6.equals("O")) {
                return true;
            } else if (polje7.equals("O") && polje8.equals("O") && polje9.equals("O")) {
                return true;

            } else if (polje1.equals("O") && polje4.equals("O") && polje7.equals("O")) {
                return true;
            } else if (polje2.equals("O") && polje5.equals("O") && polje8.equals("O")) {
                return true;

            } else if (polje3.equals("O") && polje6.equals("O") && polje9.equals("O")) {
                return true;
            } else if (polje1.equals("O") && polje5.equals("O") && polje9.equals("O")) {
                return true;
            } else if (polje3.equals("O") && polje5.equals("O") && polje7.equals("O")) {
                return true;
            } else {
                return false;
            }
        }
    }
