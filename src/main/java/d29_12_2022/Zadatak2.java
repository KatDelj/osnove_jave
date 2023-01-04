package d29_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {

       FacebookPost post1= new FacebookPost();
      post1.setImeKorisnika("Marko");
      post1.setPrezimeKorisnika("Markovic");
      post1.setImeProfil("Janko");
      post1.setPrezimeProfil("Jankovic");
      post1.setTekst("Caoooo");


        FacebookPost post2 = new FacebookPost();
        post2.setImeKorisnika("Mihajlo");
        post2.setPrezimeKorisnika("Mihajlovic");
        post2.setImeProfil("Tijana");
        post2.setPrezimeProfil("Tijanic");
        post2.setTekst("Cestitam!!!");
      post1.dodajLike();
      post1.dodajLike();
      post1.dodajLike();
      post1.dodajLike();
      post1.dodajLike();
      post1.dodajLike();
      post1.dodajLike();
      post1.dodajLike();
      post1.dodajLike();
      post1.dislike();
      post1.dodajShare();
      post1.dodajShare();
      post1.print();

      post2.dodajLike();
      post2.dodajLike();
      post2.dislike();
      post2.dodajShare();
      post2.dodajShare();
      post2.print();
    }
}
