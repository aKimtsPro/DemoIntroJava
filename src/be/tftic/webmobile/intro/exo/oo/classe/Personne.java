package be.tftic.webmobile.intro.exo.oo.classe;

public class Personne {

    // region FIELDS
    String prenom;
    String nom;
    int age;
    // endregion

    // region CTOR
    Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    // endregion

    // region METHODS
    void saluer(){
        this.saluer(null, false);
    }

    void saluer(Personne aSaluer){
        this.saluer(aSaluer, false);
    }

    void saluer(boolean sePresenter){
        this.saluer(null, sePresenter);
    }

    void saluer(Personne aSaluer, boolean sePresenter){

        String message = sePresenter ?
                ",je suis %s %s et j'ai %d ans.".formatted(this.prenom, this.nom, this.age)
                : "!";

        if( aSaluer != null )
            message = "Bonjour %s %s".formatted(aSaluer.prenom, aSaluer.nom) + message;
        else
            message = "Bonjour" + message;

        System.out.println(message);

    }
    // endregion

}
