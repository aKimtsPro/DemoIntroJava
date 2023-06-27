package be.tftic.webmobile.intro.exo.algo.boucle;

import java.util.Scanner;

public class ExoPremiers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("...");
        int n = sc.nextInt();

        for (int i = 2; i <= n ; i++) {  // 2 -> n
            // est-ce que i est premier
            boolean estPremier = true;
            for (int j = 2; j < i && estPremier ; j++) { // 2 -> i-1
                if( i % j == 0 ){
                    estPremier = false;
                }
            }

            if( estPremier ){
                System.out.println(i);
            }
        }

    }

}
