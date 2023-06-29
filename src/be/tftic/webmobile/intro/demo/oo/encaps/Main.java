package be.tftic.webmobile.intro.demo.oo.encaps;

public class Main {

    public static void main(String[] args) {

        Voiture v1 = new Voiture();
        v1.couleur = "vert";
        v1.immatriculation = "fa";
        v1.nbrPortes = 5;
//        v1.kmParcourus = 0; // impossible acces private

    }

}