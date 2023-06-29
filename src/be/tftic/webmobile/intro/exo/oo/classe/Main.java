package be.tftic.webmobile.intro.exo.oo.classe;

public class Main {

    public static void main(String[] args) {
        Personne luc = new Personne("luc", "dubois", 49);
        Personne marie = new Personne("marie", "dubuisson");
        luc.saluer();
        luc.saluer(true);
        luc.saluer(marie);
        luc.saluer(marie, true);
    }

}
