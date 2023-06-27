package be.tftic.webmobile.intro.demo.algo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoCollections {

    public static void main(String[] args) {

        // COLLECTIONS
        // List
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> entiers = new ArrayList<>();

        // Ajouter
        strings.add("luc");
        strings.add(0, "dominique");
        strings.add(1, "true");

        entiers.add(0, 15 );

        // Récupérer la taille/un élément
        for (int i = 0; i < strings.size() ; i++) {
            System.out.println( strings.get(i) );
        }

        // Supprimer un élément
        if( strings.remove( "Luc" ) )
            System.out.println("luc est supprimé");
        else
            System.out.println("luc absent de la liste");
        
        String elementSupprime = strings.remove(0);
        
        // Utilitaire
        boolean contientLuc = strings.contains("luc");
        int indexOfTrue = strings.indexOf("true"); // "true", "true"
        indexOfTrue = strings.lastIndexOf("true");
        boolean vide = strings.isEmpty();
        strings.clear(); // vide la liste

        for (String chaine : strings) {
            System.out.println(chaine);
        }



        // Set
        // Queue
        // MAP
        // Map


    }

}
