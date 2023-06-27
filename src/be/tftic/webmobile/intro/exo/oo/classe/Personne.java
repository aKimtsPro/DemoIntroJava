package be.tftic.webmobile.intro.exo.oo.classe;

public class Personne {

    String prenom;
    String nom;
    int age;

    void saluer( Personne aSaluer ){
        System.out.printf(
                "Bonjour %s %s, je m'appelle %s %s et j'ai %d ans.\n",
                aSaluer.prenom,
                aSaluer.nom,
                this.prenom,
                this.nom,
                this.age
        );
    }


}
