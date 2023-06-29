package be.tftic.webmobile.intro.demo.oo.encaps.frontiere;


import be.tftic.webmobile.intro.demo.oo.encaps.Voiture;

public class Main {

    public static void main(String[] args) {
        Voiture a = new Voiture();
        a.immatriculation = "afzadf";
        // Pas d'accès pour les attributs suivants:
//        a.couleur = "bleu";
//        a.nbrPortes = 3;
//        a.kmParcourus = 0;
        Citadine citadine = new Citadine()
    }

}
