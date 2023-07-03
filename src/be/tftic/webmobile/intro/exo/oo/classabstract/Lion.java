package be.tftic.webmobile.intro.exo.oo.classabstract;

public class Lion extends Animal {

    public Lion(String nom) {
        super(nom);
    }

    @Override
    public String parler() {
        return "Rrrh!!!";
    }
}
