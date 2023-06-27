package be.tftic.webmobile.intro.demo.oo.constructeur;

public class Main {

    public static void main(String[] args) {
        Velo velo = new Velo("noir", false, "velo de route", 60);
        Velo velo2 = new Velo();
        Velo velo3 = new Velo("bleu");
        System.out.println(velo.petitesRoues); // false
    }

}
