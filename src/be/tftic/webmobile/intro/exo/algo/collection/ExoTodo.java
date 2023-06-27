package be.tftic.webmobile.intro.exo.algo.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExoTodo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();
        char input;


        do{
            System.out.println("""
                MENU
                ----
                a - ajouter
                d - supprimer
                s - afficher
                q - quitter
                """);

            input = sc.nextLine().charAt(0);

            switch (input) {
                case 'a' -> {
                    // ajouter au debut
                    System.out.println("Quel tâche?");
                    String toAdd = sc.nextLine();
                    System.out.println("Debut ou Fin (d/f)");
                    boolean debut = sc.nextLine().charAt(0) == 'd';
                    if( debut )
                        todos.add(0, toAdd);
                    else
                        todos.add(toAdd);
                }
                case 'd' -> {
                    // supprimer
                    System.out.println("Quel tâche(donner l'index)?");
                    int indexToDelete = Integer.parseInt(sc.nextLine());
                    if (indexToDelete >= 0 && indexToDelete < todos.size()) {
                        todos.remove(indexToDelete);
                    } else {
                        System.out.println("index invalide");
                    }
                }
                case 's' -> {
                    // afficher
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.printf("%d - %s\n", i, todos.get(i));
                    }
                }
                case 'q' -> System.out.println("au revoir"); // quitter
                default  -> System.out.println("commande invalide");
            }
        }while( input != 'q' );

    }

}
