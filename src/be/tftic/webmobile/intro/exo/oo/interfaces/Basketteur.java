package be.tftic.webmobile.intro.exo.oo.interfaces;


import java.util.Objects;
import java.util.Random;

public class Basketteur extends Sportif implements Equipier {

    private int precision = 1;
    private Equipe equipe;

    public Basketteur(String prenom, String nom, int anneeNaiss, int precision){
        super(prenom, nom, anneeNaiss);
        this.setPrecision(precision);
    }

    @Override
    public int performer() {
        return new Random().nextInt(1, 11) * precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        if( precision >= 1 && precision <= 10 )
            this.precision = precision;
    }

    @Override
    public String toString() {
        return "Basketteur{" +
                "prenom='" + getPrenom() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", dateNaiss=" + getDateNaiss() +
                ", precision=" + precision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Basketteur that = (Basketteur) o;
        return getPrecision() == that.getPrecision();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrecision());
    }

    @Override
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public Equipe getEquipe() {
        return equipe;
    }

}
