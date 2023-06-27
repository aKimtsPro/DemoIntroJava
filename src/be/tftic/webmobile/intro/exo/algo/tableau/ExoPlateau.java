package be.tftic.webmobile.intro.exo.algo.tableau;

import java.util.Scanner;

public class ExoPlateau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int TAILLE_X = 5, TAILLE_Y = 5;
        int[][] plateau = new int[TAILLE_X][TAILLE_Y];
        int posX = 0, posY = 0;
        // 0 représente l'absence de pion
        // 1 représente mon pion
        plateau[posX][posY] = 1;
        char input;

        do {
            // Afficher le tableau
            for (int i = 0; i < plateau.length; i++) {
                for (int j = 0; j < plateau[i].length; j++) {
                    System.out.print( plateau[i][j] );
                }
                System.out.println();
            }

            // Permettre le choix user et bouger le pion
            System.out.println("""
                MENU: bouger le pion
                --------------------
                g - aller à gauche
                d - aller à droite
                h - aller en haut
                b - aller en bas
                q - quitter
                """);

            input = sc.nextLine().charAt(0);

            plateau[posX][posY] = 0; // on retire le pion
            switch (input) {
                case 'g' -> { if( posY > 0 ) posY--; }
                case 'd' -> { if( posY < TAILLE_Y-1 ) posY++; }
                case 'h' -> { if( posX > 0 ) posX--; }
                case 'b' -> { if( posX < TAILLE_X-1 ) posX++; }
                case 'q' -> System.out.println("au revoir!");
                default -> System.out.println("input incorrect.");
            }
            plateau[posX][posY] = 1; // On met le pion sur la case cible
        } while ( input != 'q' );

    }


}
