package be.tftic.webmobile.intro.demo.lambdas;


import be.tftic.webmobile.intro.demo.oo.heritage.Employe;
import be.tftic.webmobile.intro.demo.oo.heritage.Personne;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        InterfaceFonctionnelle ifunc = () -> {
            String message = "Je suis la méthode à redéfinir";
            System.out.println(message);
        };

        ifunc.methode();

        // java.util.function
        // Si 1 seul param: pas de parenthèse nécessaire
        // CONSUMER: param T => pas de retour
        Consumer<String> consumer = (maChaine) -> System.out.println(maChaine);
        consumer.accept( "la chaine à afficher" );
        // SUPPLIER: pas de param => retour T
        // Si la seule instruction est un 'return': ne pas le mettre (si pas d'accolade)
        Supplier<Integer> supplier = () -> new Random().nextInt(1, 11);
        System.out.println( supplier.get() );
        // FUNCTION
        Function<String, Integer> function = (chaine) -> chaine.length();
        System.out.println( function.apply("ma chaine"));
        // PREDICATE
        Predicate<Personne> predicate = (personne) -> personne.getAge() >= 18;
        System.out.println( predicate.test(new Employe("machin", "truc", 0)) );

        // Thermometre implemente le design pattern Listener
//        Thermometre thermometre = new Thermometre();
//
//        thermometre.sAbonner( (newTemp) -> System.out.printf("Nouvelle temperature: %f\n", newTemp) );
//        thermometre.sAbonner( (newTemp) -> System.out.printf("Nouvelle temperatureX2: %f\n", newTemp) );
//
//        thermometre.setTemperature(15);
//        thermometre.setTemperature(-15);
//        thermometre.setTemperature(0);

    }

}
