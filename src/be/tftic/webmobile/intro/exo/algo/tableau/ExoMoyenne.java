package be.tftic.webmobile.intro.exo.algo.tableau;

import java.util.Scanner;

public class ExoMoyenne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab = new int[10];

        // remplir le tableau
        for (int i = 0; i < tab.length ; i++) {
            System.out.print("valeur pour la " + (i+1) + "e case: " );
            tab[i] = sc.nextInt();
        }

        // trouver la moyenne
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }

        System.out.println("moyenne : "  +  ((double)sum / tab.length));

    }

}
