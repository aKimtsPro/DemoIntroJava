package be.tftic.webmobile.intro.demo.oo.heritage;

public class Employe extends Personne {
    private int salaire;

    public Employe(String nom, String prenom, int salaire) {
        super(nom, prenom);
//        super();
        this.salaire = salaire;
    }

    // Redéfinition obligatoire: la méthode est héritée abstraite
    @Override
    public void travailler() {
        System.out.println("pif pouf je travailles");
    }

    // Permet de produire une erreur de compilation si ce n'est pas une réécriture
    public String getSalutation(){
        return "Salut!";
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
