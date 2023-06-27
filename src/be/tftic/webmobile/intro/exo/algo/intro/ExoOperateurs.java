package be.tftic.webmobile.intro.exo.algo.intro;

import java.util.Scanner;

public class ExoOperateurs {

    /**
     * <h1>Créez un convertisseur de seconde:</h1>
     *
     * demandez à l'utilisateur un certain nombre de secondes.
     * Transformez ce nombre de secondes en jours, heures, minutes, secondes.
     *
     * Exemple:
     *
     * 4561 secondes
     * =>
     * 0 jours, 1 heures, 16 minutes, 1 secondes
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre de secondes");
//        String input = sc.nextLine();
//        int nbrSec = Integer.parseInt( input );

        int nbrSec = sc.nextInt();

        int j, h, m, s;

        m = nbrSec / 60;
        s = nbrSec % 60;

        h = m / 60;
        m %= 60;

        j = h / 24;
        h %= 24;

        System.out.println(
                        "jours: " + j +
                        "\nheures: " + h +
                        "\nminutes: " + m +
                        "\nsecondes: " + s
        );



    }
}
