package be.tftic.webmobile.intro.exo.oo.encaps;

import java.time.LocalDate;

public class Sportif {

    private String prenom;
    private String nom;
    private int dateNaiss = 1900;

    public Sportif(String prenom, String nom, int anneeNaiss) {
        this.prenom = prenom;
        this.nom = nom;
        this.setDateNaiss(anneeNaiss);
    }

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
}
