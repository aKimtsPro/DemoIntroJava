package be.tftic.webmobile.intro.demo.algo;

import java.util.Scanner;

public class DemoBoucles {

    public static void main(String[] args) {

        // WHILE

        int nbrOeuf = 5;

        // VERIF -> EXEC -> VERIF -> EXEC -> ...
        while ( nbrOeuf > 0 ) {
            System.out.println("Je lance un oeuf");
            nbrOeuf--;
        }

        System.out.println("il n'y a plus d'oeufs dans le frigo");

        // DO ... WHILE

        System.out.println("entrez un nombre entre 1 et 10");
        Scanner sc = new Scanner(System.in);

        int nombre = 5;

        // EXEC -> VERIF -> EXEC -> VERIF -> ...
        do {
            nombre = sc.nextInt();
        } while( nombre < 1 || nombre > 10 );

        System.out.println(nombre);

        // For - raccourci: 'fori' + tab
        int i;
        for (i = 5; i > 0; i--) {
            System.out.println("Je lance un oeuf");
        }
//        OU
//        for (int i = 5; i > 0; i--) {
//            System.out.println("Je lance un oeuf");
//        }
        String a = null;
        for(/*je peux ne rien mettre*/; (a=sc.next()).length() > 5 ;/*je peux ne rien mettre*/);

        for(int cpt = 0; cpt < 10 ; cpt += 2){
            System.out.println(cpt);
        }

        for( int valeur = 100; valeur >= 1 ; valeur /= 2){
            System.out.println(valeur);
        }


    }
}
