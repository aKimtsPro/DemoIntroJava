package be.tftic.webmobile.intro.exo.oo.enums;

public class Boxeur extends Sportif {

    private Categorie categorie;

    public Boxeur(String prenom, String nom, int anneeNaiss, Categorie categorie) {
        super(prenom, nom, anneeNaiss);
        this.categorie = categorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public int performer() {
        return 0;
    }
}
