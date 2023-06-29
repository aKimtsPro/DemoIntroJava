package be.tftic.webmobile.intro.demo.oo.heritage;

public class Employe extends Personne {
    private int salaire;

    public Employe(String nom, String prenom, int salaire) {
        super(nom, prenom);
//        super();
        this.salaire = salaire;
    }

    @Override // Permet de produire une erreur de compilation si ce n'est pas une réécriture
    public String getSalutation(){
        return "Salut!";
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
