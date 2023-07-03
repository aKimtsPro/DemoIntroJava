package be.tftic.webmobile.intro.exo.oo.classabstract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Scanner sc = new Scanner(System.in);

        char input;

        do {
            System.out.println("""
                MENU
                ----
                1 - ajouter zebre
                2 - ajouter lion
                3 - faire parler
                4 - quitter
                """);
            input = sc.nextLine().charAt(0);

            switch (input) {
                case '1' -> {
                    System.out.println("Quel nom pour le zebre?");
                    String nom = sc.nextLine();
                    zoo.ajouter( new Zebre(nom) );
                }
                case '2' -> {
                    System.out.println("Quel nom pour le lion?");
                    String nom = sc.nextLine();
                    zoo.ajouter( new Lion(nom) );
                }
                case '3' -> {
                    for (Animal animal : zoo.getAnimals()) {
                        System.out.println(animal.parler());
                    }
                }
                case '4' -> System.out.println("au revoir");
                default -> System.out.println("commande invalide");
            }

        } while( input != '4' );
    }


}
