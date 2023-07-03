package be.tftic.webmobile.intro.demo.oo.statics;

public class Moto {

    private static int nbrRoue = 2;
    private String immatriculation;
    private String couleur;

    public Moto(String immatriculation, String couleur) {
        this.immatriculation = immatriculation;
        this.couleur = couleur;
    }

    public static Moto blueWith(String immatriculation) {
        return new Moto(immatriculation, "blue");
    }
    public static Moto redWith(String immatriculation){
        return new Moto(immatriculation, "red");
    }

    public static int getNbrRoue() {
        return nbrRoue;
    }

    public static void setNbrRoue(int nbrRoue) {
        Moto.nbrRoue = nbrRoue;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
