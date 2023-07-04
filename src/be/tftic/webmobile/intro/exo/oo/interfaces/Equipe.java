package be.tftic.webmobile.intro.exo.oo.interfaces;

import java.util.HashSet;
import java.util.Set;

public class Equipe {

    private final Set<Equipier> equipiers = new HashSet<>();
    private String nom;

    public Equipe(String nom) {
        this.nom = nom;
    }

    public Set<Equipier> getEquipiers() {
        return new HashSet<>(equipiers);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    boolean ajouter(Equipier equipier){
        if( equipier.getEquipe() != null )
            return false;

        boolean success = equipiers.add(equipier);
        if( success )
            equipier.setEquipe(this);

        return success;
    }

    boolean retirer(Equipier equipier){
        boolean success = equipiers.remove(equipier);
        if( success )
            equipier.setEquipe(null);

        return success;
    }

}
