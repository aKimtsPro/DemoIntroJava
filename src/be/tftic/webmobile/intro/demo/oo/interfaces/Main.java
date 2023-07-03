package be.tftic.webmobile.intro.demo.oo.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        IVolant volant = new Avion("...", "...");
        IVolant volant = new Oiseau("...", "...");

        volant.voler();

        List<String> list = new ArrayList<>();
        list = new LinkedList<>();

    }

}
