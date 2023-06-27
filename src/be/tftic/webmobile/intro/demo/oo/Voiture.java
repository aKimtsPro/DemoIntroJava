package be.tftic.webmobile.intro.demo.oo;

public class Voiture {

    String immatriculation;
    String couleur;
    int nbrPortes;
    int kmParcourus;

    void rouler(int distance, boolean affDistance){
        System.out.printf("this.couleur: %s\n", this.couleur);

        kmParcourus += distance;

        if( affDistance )
            System.out.printf("Je roule %d km\n", distance);
        else
            System.out.println("Je roule");
    }

    Voiture comparer(Voiture aComparer){
        if(aComparer == null)
            return this;

        return (kmParcourus >= aComparer.kmParcourus) ? this : aComparer;
    }

}
