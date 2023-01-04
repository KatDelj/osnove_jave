package d29_12_2022;

public class FacebookPost {

    private String imeKorisnika;
    private String prezimeKorisnika;

    private String imeProfil;
    private String prezimeProfil;
    private String tekst;
    private int brLike;
    private int brShare;


    public String getImeKorisnikameKorisnika() {
        return this.imeKorisnika;
    }
     public String getPrezimeKorisnika(){
        return this.prezimeKorisnika;

    }
    public String getImeProfil(){
        return this.imeProfil;
    }
    public String getPrezimeProfil(){
        return this.prezimeKorisnika;
    }
    public String getTekst(){
        return this.tekst;
    }
    public int getBrLike(){
        return this.brLike;
    }
    public int getBrShare(){
        return this.brShare;
    }
    public void setImeKorisnika (String imeKorisnika){
        this.imeKorisnika=imeKorisnika;
    }
    public void setPrezimeKorisnika(String prezimeKorisnika){
        this.prezimeKorisnika=prezimeKorisnika;
    }
    public void setImeProfil (String imeProfil){
        this.imeProfil=imeProfil;

    }
    public void setPrezimeProfil (String prezimeProfil){
        this.prezimeProfil=prezimeProfil;
    }
    public void setTekst (String tekst){
        this.tekst=tekst;
    }
    public void dodajLike(){
        this.brLike=this.brLike+1;
    }
    public void dislike(){
        if(brLike>0){
        this.brLike= this.brLike-1;
    }
        else {
            this.brLike= this.brLike;
        }

        }
    public void dodajShare(){
        this.brShare=this.brShare + 1;
    }
    public void print() {
        System.out.println(imeKorisnika + " " + prezimeKorisnika + " >>> " + imeProfil + " " + prezimeProfil);
        System.out.println(tekst);
        System.out.println("Likes " + brLike + "| Shares " + brShare);

    }
}

