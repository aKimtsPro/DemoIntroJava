package be.tftic.webmobile.intro.demo.oo.encaps.frontiere;

import be.tftic.webmobile.intro.demo.oo.encaps.Voiture;

public class Citadine extends Voiture {

    Citadine(String immatriculation, String couleur, int nbrPortes, int kmParcourus){

        this.immatriculation/*ceci est une variable d'instance*/ = immatriculation/*ceci est paramètre*/;
        this.couleur = couleur;
        // Pas d'accès aux variables d'instances nbrPortes et kmParcourus
//        this.nbrPortes = 5;
//        this.kmParcourus = 0;
    }



}
