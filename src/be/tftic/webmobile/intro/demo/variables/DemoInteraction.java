package be.tftic.webmobile.intro.demo.variables;

import java.util.Scanner;

public class DemoInteraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer votre nom:");

        String inputUser = sc.nextLine();

        System.out.println("Vous vous appelez " + inputUser);



    }

}
