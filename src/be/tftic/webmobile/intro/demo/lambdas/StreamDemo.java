package be.tftic.webmobile.intro.demo.lambdas;

import be.tftic.webmobile.intro.demo.oo.heritage.Employe;
import be.tftic.webmobile.intro.demo.oo.heritage.Personne;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        Collection<Employe> personnes = new ArrayList<>();

        personnes.add( new Employe( "dubois", "luc",2000));
        personnes.add( new Employe("dubuisson","marie",  20000));
        personnes.add( new Employe( "dubosquet","dominique", 1300));
        personnes.add( new Employe( "dubosqueteur","dominique", 1700));

        // Récupérer les prénoms des employés avec un salaire de plus de 5000
        /*List<String> prenoms =*/ personnes.stream()
                .filter( employe -> employe.getSalaire() > 5000 ) // Predicate
                .map( employe -> employe.getPrenom() ) // Function
//                .toList();
                .forEach(data -> System.out.println(data)); // Consumer

        // On ne peut pas appliquer 2 opérations intermédiaires sur le même stream
        Stream<Employe> stream = personnes.stream();
        stream.filter((param) -> true);
//        stream.filter((param) -> true); // => IllegalStateException


        // OPERATIONS INTERMEDIAIRES:

        // filter(Predicate): filtre les éléments
        personnes.stream()
                .filter( p -> p.getPrenom().charAt(0) <= 'g' )
//                .forEach(p -> System.out.println(p));
                .forEach(System.out::println); // pareil que ^

        // Pas un supplier car pour l'executer, il faut savoir "l'age de qui?"
//        Function<Personne, Integer> supplier = Personne::getAge;

        // map(Function): transforme chaque élément en un autre
        personnes.stream()
                .map(p -> p.getPrenom() + ' ' + p.getNom())
                .forEach(System.out::println);

        // distinct(): ne garde pas les doublons
        personnes.stream()
                .map(p -> p.getPrenom())
                .distinct()
                .forEach(System.out::println); // ne garde qu'un seul "dominique"

        // sorted(): ordonne les éléments (si pas instanceof Comparable, donner un Comparator)
        personnes.stream()
                .map(p -> p.getPrenom())
                .sorted() // dépend du compareTo de String
                .forEach(System.out::println);

        // peek(): forEach intermediaire
        personnes.stream()
                .peek(System.out::println)
                .filter(p -> p.getSalaire() > 5000)
                .forEach(System.out::println);

        // skip(int): saute les X premiers éléments
        // limit(int): se limite aux X prochains éléments
        personnes.stream()
                .skip(1) // on skip le 1e
                .limit(2) // on prend les 2 suivants
                .forEach(System.out::println); // le 2 et 3e

        // OPERATIONS TERMINALES:
        // forEach: exécute une action sur chaque éléments
        personnes.stream()
//                .map(p -> p.getPrenom())
                .map(Personne::getPrenom)
                .forEach(System.out::println);

        // collect(Collector): rassemble en une collection (plus précis)
        // toList(): rassemble en une liste (UnmodifiableList - immutable) (plus simple)
        List<String> prenoms = personnes.stream()
                .map(Personne::getPrenom)
                .toList();
//                .collect(Collectors.toList());

        // toArray(): rassemble en un tableau
        String[] tabPrenom = personnes.stream()
                .map(Personne::getPrenom)
//                .toArray(taille -> new String[taille]);
                .toArray(String[]::new);


        // min() / max()
        Optional<String> minMaxPrenom = personnes.stream()
                .map(Personne::getPrenom)
//                .max(String::compareTo);
                .min(String::compareTo);

        // findFirst() / findAny() : trouver le premier / un des éléments(toujours le premiers en sequentiel)
        Optional<String> findPrenom = personnes.stream()
                .map(Personne::getPrenom)
//                .max(String::compareTo);
                .findAny();
//                .findFirst();

        // anyMatch(Predicate) :
        boolean anyMatch = personnes.stream()
                .anyMatch(p -> p.getPrenom().startsWith("d")); // true
        // allMatch(Predicate) :
        boolean allMatch = personnes.stream()
                .allMatch(p -> p.getPrenom().charAt(0) == 'd'); // false
        // noneMatch(Predicate) :  ( opposé de anyMatch() )
        boolean noneMatch = personnes.stream()
                .noneMatch(p -> p.getPrenom().charAt(0) == 'd'); // false

        // count()
        long nombreElement = personnes.stream()
                .map(Personne::getPrenom)
                .count();



        // Optional:
        // - objet soit vide soit rempli
        // - evite les NullPointerException
        // - oblige la réaction au vide

        // get()
        String prenom = minMaxPrenom.get(); // si vide => NoSuchElementException

        // orElse(valeur secours)
        prenom = minMaxPrenom.orElse("valeur secours");

        // orElseGet(Supplier)
        prenom = minMaxPrenom.orElseGet(() -> new String("valeur secours lourde"));

        // orElseThrow() - pareil que get()
        prenom = minMaxPrenom.orElseThrow();

        // orElseThrow(Supplier<? extends Exception>)
        prenom = minMaxPrenom.orElseThrow(() -> new RuntimeException("mon exception custom"));

        minMaxPrenom.ifPresent(System.out::println);
        minMaxPrenom.ifPresentOrElse(System.out::println, () -> System.out.println("y a rien"));


    }

}
