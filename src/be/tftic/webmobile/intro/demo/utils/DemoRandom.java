package be.tftic.webmobile.intro.demo.utils;

import java.util.Random;

public class DemoRandom {

    public static void main(String[] args) {

        Math.random();


        Random rdm = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println( rdm.nextInt(0, 101) );
        }

    }

}
