package be.tftic.webmobile.intro.exo.oo.heritage;


import java.util.Objects;
import java.util.Random;

public class Cycliste extends Sportif {

    private int kmParcourus;

    public Cycliste(String prenom, String nom, int anneeNaiss, int kmParcourus) {
        super(prenom, nom, anneeNaiss);
        this.setKmParcourus(kmParcourus);
    }

    @Override
    public int performer() {
        int modificateur = 0;

        if ( kmParcourus >= 500 )
            modificateur = 50;
        else if ( kmParcourus >= 400 )
            modificateur = 40;
        else if ( kmParcourus >= 300 )
            modificateur = 30;
        else if ( kmParcourus >= 200 )
            modificateur = 20;
        else if ( kmParcourus >= 100 )
            modificateur = 10;

        return new Random().nextInt(0, 51) + modificateur;
    }

    public int getKmParcourus() {
        return kmParcourus;
    }

    public void setKmParcourus(int kmParcourus) {
        if( kmParcourus >= 0 )
            this.kmParcourus = kmParcourus;
    }

    @Override
    public String toString() {
        return "Cycliste{" +
                "prenom='" + getPrenom() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", dateNaiss=" + getDateNaiss() +
                ", kmParcourus=" + kmParcourus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cycliste cycliste = (Cycliste) o;
        return getKmParcourus() == cycliste.getKmParcourus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getKmParcourus());
    }
}
