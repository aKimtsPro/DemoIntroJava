package be.tftic.webmobile.intro.demo.algo;

import java.util.Scanner;

public class DemoConditionnelle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel âge avez-vous?");
        int age = sc.nextInt();

        // if
        if( age >= 65 ){
            System.out.println("Vous êtes à la retraite");
        }
        else if ( age >= 18 ) {
            System.out.println("Vous êtes majeur");
        }
        else if ( age >= 0 ) {
            System.out.println("Vous êtes mineur");
        }
        else {
            System.out.println("age invalide");
        }

        // forme raccourcie
        if( age >= 65 )
            System.out.println("Vous êtes à la retraite");
        else if ( age >= 18 )
            System.out.println("Vous êtes majeur");
        else if ( age >= 0 )
            System.out.println("Vous êtes mineur");
        else
            System.out.println("age invalide");


        // switch
        System.out.println("Quel est votre nom?");
        String nom = sc.next();

        switch (nom) {
            case "luc", "marie":
                System.out.println("Bonjour CEO");
                break;
            case "dominique":
                System.out.println("Bonjour administratif");
                break;
            default:
                System.out.println("Bonjour employé");
        }

        // depuis java 14
        switch (nom) {
            case "luc", "marie" -> {
                System.out.println("Bonjour CEO");
                System.out.println("okok");
            }
            case "dominique" -> System.out.println("Bonjour administratif");
            default -> System.out.println("Bonjour employé");
        }


        // opérateur ternaire
        String message = age >= 18 ? "majeur" : "mineur";


    }

}
