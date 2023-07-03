package be.tftic.webmobile.intro.demo.oo.interfaces;

public abstract class Animal {

    private final String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
