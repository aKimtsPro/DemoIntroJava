package be.tftic.webmobile.intro.demo.oo.constructeur;

public class Velo {

    String couleur = "vert";
    boolean petitesRoues; // = false
    String type = "velo de vitesse";
    int diametreRoue = 58; // = 0

    // il est possible de surcharger le constructeur.
    // ATTENTION: ne pas créer plusieurs ctor avec les mm paramètres
    // Velo - ctor - /
    Velo(){}

    // Velo - ctor - String
    Velo(String couleur) {
        this.couleur = couleur;
    }


    // Velo - ctor - String,boolean,String,int
    Velo(String couleur, boolean petitesRoues, String type, int diametreRoue){
        // Grâce à this on peut accéder aux variables d'instance
        this.couleur = couleur;
        this.petitesRoues = petitesRoues;
        this.type = type;
        this.diametreRoue = diametreRoue;
    }

}
