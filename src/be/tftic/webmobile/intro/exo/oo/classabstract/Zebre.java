package be.tftic.webmobile.intro.exo.oo.classabstract;

public class Zebre extends Animal {

    public Zebre(String nom){
        super(nom);
    }

    @Override
    public String parler() {
        return "Hi han?!";
    }
}
