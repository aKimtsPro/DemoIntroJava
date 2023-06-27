package be.tftic.webmobile.intro.exo.boucle;

import java.util.Scanner;

public class ExoCalculatrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean continuer;
        do {
            System.out.println("veuillez entrer un nombre, un opérateur(+,-,x,/,%) et un autre nombre");
            double nbr1 = sc.nextDouble();
            char ope = sc.next().charAt(0);
            double nbr2 = sc.nextDouble();

            switch (ope) {
                case '+':
                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1+nbr2));
                    break;
                case '-':
                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1-nbr2));
                    break;
                case '*':
                case 'x':
                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1*nbr2));
                    break;
                case '/':
                    if( nbr2 == 0 ) {
                        System.out.println("division par 0 impossible");
                    }
                    else {
                        System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1 / nbr2));
                    }
                    break;
                case '%':
                    if( nbr2 == 0 ){
                        System.out.println("modulo 0 impossible");
                    }
                    else {
                        System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1%nbr2));
                    }
                default:
                    System.out.println("opérateur invalide");
            }


            System.out.println("Voulez-vous continuer? (y/n)");
            continuer = sc.next().charAt(0) == 'y';
        } while ( continuer );


//        boolean continuer = true;
//        while(continuer) {
//            System.out.println("veuillez entrer un nombre, un opérateur(+,-,x,/,%) et un autre nombre");
//            double nbr1 = sc.nextDouble();
//            char ope = sc.next().charAt(0);
//            double nbr2 = sc.nextDouble();
//
//            switch (ope) {
//                case '+':
//                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1+nbr2));
//                    break;
//                case '-':
//                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1-nbr2));
//                    break;
//                case '*':
//                case 'x':
//                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1*nbr2));
//                    break;
//                case '/':
//                    if( nbr2 == 0 ) {
//                        System.out.println("division par 0 impossible");
//                    }
//                    else {
//                        System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1 / nbr2));
//                    }
//                    break;
//                case '%':
//                    if( nbr2 == 0 ){
//                        System.out.println("modulo 0 impossible");
//                    }
//                    else {
//                        System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1%nbr2));
//                    }
//                default:
//                    System.out.println("opérateur invalide");
//            }
//
//            System.out.println("Voulez-vous continuer? (y/n)");
//            continuer = sc.next().charAt(0) == 'y';
//        }

    }

}
