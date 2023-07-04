package be.tftic.webmobile.intro.exo.oo.enums;

public class Main {

    public static void main(String[] args) {

        Boxeur boxeur1 = new Boxeur("dominique", "dubosquet", 1990, Categorie.PLUME);
        Boxeur boxeur2 = new Boxeur("luc", "dubois", 1990, Categorie.LEGER);
        Boxeur boxeur3 = new Boxeur("marie", "dubuisson", 1990, Categorie.MOYEN);
        Boxeur boxeur4 = new Boxeur("jm", "foret", 1990, Categorie.LOURD);

        System.out.println("- PLUME -");
        System.out.println( boxeur1.getCategorie() );
        System.out.println( boxeur1.getCategorie().getDessus() );
        System.out.println( boxeur1.getCategorie().getDessous() );
        System.out.println( boxeur1.getCategorie().getPoidMin() );
        System.out.println( boxeur1.getCategorie().getPoidMax() );


        System.out.println("- LEGER -");
        System.out.println( boxeur2.getCategorie() );
        System.out.println( boxeur2.getCategorie().getDessus() );
        System.out.println( boxeur2.getCategorie().getDessous() );
        System.out.println( boxeur2.getCategorie().getPoidMin() );
        System.out.println( boxeur2.getCategorie().getPoidMax() );


        System.out.println("- MOYEN -");
        System.out.println( boxeur3.getCategorie() );
        System.out.println( boxeur3.getCategorie().getDessus() );
        System.out.println( boxeur3.getCategorie().getDessous() );
        System.out.println( boxeur3.getCategorie().getPoidMin() );
        System.out.println( boxeur3.getCategorie().getPoidMax() );


        System.out.println("- LOURD -");
        System.out.println( boxeur4.getCategorie() );
        System.out.println( boxeur4.getCategorie().getDessus() );
        System.out.println( boxeur4.getCategorie().getDessous() );
        System.out.println( boxeur4.getCategorie().getPoidMin() );
        System.out.println( boxeur4.getCategorie().getPoidMax() );


    }

}
