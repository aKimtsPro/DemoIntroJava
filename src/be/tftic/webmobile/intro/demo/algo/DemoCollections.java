package be.tftic.webmobile.intro.demo.algo;

import java.lang.reflect.Array;
import java.util.*;

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

        // Set - pas de doublon, pas d'ordre, pas de recupération
        HashSet<String> monSet = new HashSet<>();

        monSet.add("salut");
        monSet.add("salut");

        System.out.println("--- HASHSET ---");
        for (String s : monSet) {
            System.out.println(s);
        }
        monSet.remove("salut");

        // marie, dominique, pol

        // Queue - FIFO
        Queue<String> queue = new LinkedList<>();
        queue.add("à la fin");
        queue.remove(); // supprime le premier - error si vide
        queue.poll();   // supprime le premier
        String checkPremier = queue.peek();


        // Stack - LIFO
        Stack<String> stack = new Stack<>();
        stack.push("a la fin");
        String checkDernier = stack.peek(); // check le dernier sans le supprimer
        String leDernier = stack.pop(); // supprime et recupère le dernier


        // MAP
        // Map
        System.out.println("--- MAP ---");
        HashMap<String,Integer> notes = new HashMap<>();
        // insertion si la clef n'existe pas encore dans la map
        notes.put( "marie", 15 );
        notes.put( "luc", 12);
        // modification de la valeur associé à la clef si elle existe déjà dans la map
        notes.put( "marie", 17 );

        // Récupérer une valeur?
        System.out.println( notes.get("marie") ); // => 17

        notes.remove("marie");

        boolean marieExiste = notes.containsKey("marie"); // => false
        boolean laNote12Existe = notes.containsValue(12); // => true

        // Parcours l'ensemble des Key/Value
        for (String s : notes.keySet()) {
            System.out.printf("%s -> %d\n", s, notes.get(s));
        }

        for (Map.Entry<String, Integer> entry : notes.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }

    }

}
