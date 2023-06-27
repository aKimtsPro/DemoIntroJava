package be.tftic.webmobile.intro.exo.oo.classe;

public class Main {

    public static void main(String[] args) {
        Personne luc = new Personne();
        luc.prenom = "luc";
        luc.nom = "dubois";
        luc.age = 49;

        Personne marie = new Personne();
        marie.prenom = "marie";
        marie.nom = "dubuisson";
        marie.age = 52;

        luc.saluer(marie);
    }

}
