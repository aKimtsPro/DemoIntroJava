package be.tftic.webmobile.intro.exo.algo.intro;

import java.util.Scanner;

public class ExoInteraction {

    /**
     * <h1>EXO: interaction avec l'utilisateur</h1>
     * Demandez à l'utilisateur un caractère
     * alphabatique en majuscule.
     * Ecrivez en console ce caractère en minuscule.
     */
    public static void main(String[] args) {

        System.out.println("Entrez une lettre majuscule");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        char lettreMaj = input.charAt(0);
//        char lettreMin = (char) (lettreMaj + ('a' - 'A'));

        String inputMin = input.toLowerCase();
        char lettreMin = inputMin.charAt(0);

        System.out.println(lettreMin);

    }

}
