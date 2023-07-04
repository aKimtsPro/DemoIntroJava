package be.tftic.webmobile.intro.exo.oo.interfaces;

public class Main {

    public static void main(String[] args) {

        Equipe equipe1 = new Equipe("Les Javaïstes");
        Equipe equipe2 = new Equipe("Les CSharpeurs");

        Equipier equipier1 = new Basketteur("luc","dubois",1990,5);

        System.out.println("ajout d'un equipier non contenu n'ayant pas d'equipe");
        if( equipe1.ajouter(equipier1) )
            System.out.println("succes");
        else
            System.out.println("echec");

        System.out.println("ajout d'un equipier déjà contenu ayant une equipe");
        if( equipe1.ajouter(equipier1) )
            System.out.println("succes");
        else
            System.out.println("echec");


        System.out.println("ajout d'un equipier non contenu ayant une equipe");
        if( equipe2.ajouter(equipier1) )
            System.out.println("succes");
        else
            System.out.println("echec");


        System.out.println("retrait d'un equipier contenu");
        if( equipe1.retirer(equipier1) )
            System.out.println("succes");
        else
            System.out.println("echec");


        System.out.println("retrait d'un equipier non contenu");
        if( equipe2.retirer(equipier1) )
            System.out.println("succes");
        else
            System.out.println("echec");

        System.out.println("Verifier que l'equipier retiré a bien perdu son equipe");
        if( equipier1.getEquipe() == null )
            System.out.println("succès");
        else
            System.out.println("echec");



    }

}
