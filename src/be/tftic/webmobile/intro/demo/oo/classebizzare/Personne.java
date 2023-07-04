package be.tftic.webmobile.intro.demo.oo.classebizzare;

public class Personne {

    private String nom;
    private String prenom;

    // si on devait ecrire tous les constructeurs (toutes les options)
//    private Personne() {
//    }
//
//    private Personne(String nom) {
//        this.nom = nom;
//    }

    private Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static PersonneBuilder builder(){
        return new PersonneBuilder();
    }

    public static class PersonneBuilder {

        private String nom;
        private String prenom;

        public PersonneBuilder nom(String nom){
            this.nom = nom;
            return this;
        }

        public PersonneBuilder prenom(String prenom){
            this.prenom = prenom;
            return this;
        }

        public Personne build(){
            return new Personne(nom, prenom);
        }

    }

}
