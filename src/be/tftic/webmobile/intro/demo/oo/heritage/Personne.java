package be.tftic.webmobile.intro.demo.oo.heritage;

public class Personne {

    private String nom;
    private String prenom;
    private int age;

//    public Personne(){}
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    public String getSalutation() {
        return "Bonjour!";
    }

    @Override
    public String toString() {
        return "Personne{nom:%s, prenom: %s, age: %d}".formatted(nom, prenom, age);
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Personne) )
            return false;

        Personne p = (Personne)obj;

        return  p.prenom.equals(this.prenom) &&
                p.nom.equals(this.nom) &&
                p.age == this.age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
