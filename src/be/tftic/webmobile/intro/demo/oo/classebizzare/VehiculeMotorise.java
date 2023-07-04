package be.tftic.webmobile.intro.demo.oo.classebizzare;

public class VehiculeMotorise {

    private String marque;
    private String modele;
    private Moteur moteur;

    public VehiculeMotorise(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
        this.moteur = new Moteur(100, "V4");
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public static class Moteur {

        private int puissance;
        private String type;


        public Moteur(int puissance, String type) {
            this.puissance = puissance;
            this.type = type;
        }

        public int getPuissance() {
            return puissance;
        }

        public void setPuissance(int puissance) {
            this.puissance = puissance;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
