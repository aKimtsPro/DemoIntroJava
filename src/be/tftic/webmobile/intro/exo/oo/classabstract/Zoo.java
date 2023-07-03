package be.tftic.webmobile.intro.exo.oo.classabstract;

import java.util.HashSet;

public class Zoo {

    private final HashSet<Animal> animals = new HashSet<>();

    public void ajouter(Animal animal){
        animals.add(animal);
    }

    public HashSet<Animal> getAnimals() {
        return new HashSet<>(animals);
    }
}
