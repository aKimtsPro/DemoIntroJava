package be.tftic.webmobile.intro.demo.oo.classe;

public class Voiture {

    String immatriculation;
    String couleur;
    int nbrPortes;
    int kmParcourus;

    // VehiculeMotorise - rouler - /
    void rouler() {
        rouler(100, true);
    }

    // VehiculeMotorise - rouler - int
    void rouler(int distance) {
        rouler(distance, true);
    }

    // Signature:
    // - la classe ou l'interface définissant la méthode
    // - le nom de la méthode
    // - l'ordre/le type des paramètre
    // VehiculeMotorise - rouler - int,boolean
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
