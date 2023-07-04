package be.tftic.webmobile.intro.exo.oo.enums;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Sportif {

    private String prenom;
    private String nom;
    private int dateNaiss = 1900;

    public Sportif(String prenom, String nom, int anneeNaiss) {
        this.prenom = prenom;
        this.nom = nom;
        this.setDateNaiss(anneeNaiss);
    }

    public abstract int performer();

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(int dateNaiss) {
        if( dateNaiss >= 1900 && dateNaiss <= LocalDate.now().getYear() )
            this.dateNaiss = dateNaiss;
    }

    @Override
    public String toString() {
        return "Sportif{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", dateNaiss=" + dateNaiss +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Sportif sportif = (Sportif) o;
        return dateNaiss == sportif.dateNaiss &&
                Objects.equals(prenom, sportif.prenom) &&
                Objects.equals(nom, sportif.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenom, nom, dateNaiss);
    }
}

