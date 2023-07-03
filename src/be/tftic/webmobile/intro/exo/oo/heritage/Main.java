package be.tftic.webmobile.intro.exo.oo.heritage;

public class Main {

    public static void main(String[] args) {
        // TEST EQUALS / TOSTRING
//        Basketteur bsk = new Basketteur("Luc", "Dubois", 1990, 5);
//        Basketteur bsk2 = new Basketteur("Luc", "Dubois", 1990, 5);
//
//        System.out.println(bsk + " - " + bsk2 + ": " + (bsk.equals(bsk2) ? "égaux" : "différents"));


        // TEST PERFORM Basketteur
        Basketteur bsk = new Basketteur("Luc", "Dubois", 1990, 1);
        Basketteur bsk2 = new Basketteur("Luc", "Dubois", 1990, 10);

        System.out.println("--- BASKETTEUR 1 (precision: 1) ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(bsk.performer());
        }

        System.out.println("--- BASKETTEUR 2 (precision: 10) ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(bsk2.performer());
        }


        // Test performance judoka
        Judoka judo = new Judoka("Marie", "Dubuisson", 1984, 50.);
        Judoka judo2 = new Judoka("Dominique", "Dubuisson", 1984, 100.);

        System.out.println("--- JUDOKA 1 (poid: 50) ---");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += judo.performer();
        }
        System.out.println(sum/10);
        sum = 0;
        System.out.println("--- JUDOKA 2 (poid: 100) ---");
        for (int i = 0; i < 10; i++) {
            sum += judo.performer();
        }
        System.out.println(sum/10);

        // Test performance cycliste
        Cycliste cycl = new Cycliste("Marie", "Dubuisson", 1984, 100);
        Cycliste cycl2 = new Cycliste("Dominique", "Dubuisson", 1984, 1000);

        System.out.println("--- Cycliste 1 (km: 100) ---");
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += cycl.performer();
        }
        System.out.println(sum/10);
        sum = 0;
        System.out.println("--- Cycliste 2 (poid: 1000) ---");
        for (int i = 0; i < 10; i++) {
            sum += cycl2.performer();
        }
        System.out.println(sum/10);
    }

}
