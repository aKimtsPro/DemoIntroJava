package be.tftic.webmobile.intro.exo.oo.heritage;


import java.util.Objects;
import java.util.Random;

public class Judoka extends Sportif {

    private double poid;

    public Judoka(String prenom, String nom, int anneeNaiss, double poid) {
        super(prenom, nom, anneeNaiss);
        this.setPoid(poid);
    }

    @Override
    public int performer() {
        int modificateur = new Random().nextInt(1,51);
        return (int)((poid / 2) + modificateur);
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        if( poid >= 0 )
            this.poid = poid;
    }

    @Override
    public String toString() {
        return "Judoka{" +
                "prenom='" + getPrenom() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", dateNaiss=" + getDateNaiss() +
                ", poid=" + poid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        Judoka judoka = (Judoka) o;
        return Double.compare(judoka.getPoid(), getPoid()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPoid());
    }
}
