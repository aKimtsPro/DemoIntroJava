package be.tftic.webmobile.intro.exo.oo.classabstract;

public abstract class Animal {

    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public abstract String parler();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
