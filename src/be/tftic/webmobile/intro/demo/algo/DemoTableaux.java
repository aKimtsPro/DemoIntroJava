package be.tftic.webmobile.intro.demo.algo;

public class DemoTableaux {

    public static void main(String[] args) {

        int[] tab = new int[5];     // {0,0,0,0,0}
        int[] tab2 = { 1,2,3,4,5 }; // uniquement
//        tab2 = {1,2,3};           // impossible
        tab2 = new int[]{1,2,3};   // possible

        tab2 = new int[5];

        System.out.println( tab == tab2 ); // false

        String[] tabChaine = new String[10];

        tab[0] = 5;
        tab[1] = tab[0]+1;
        tab[2] = 'A'; // conversion implicite en int

//        tab[18] = 5; // ArrayIndexOutOfBoundsExcpetion: Index 18 out of bounds for length 5
//        System.out.println(tab[18]);

        System.out.println("taille du tableau: " + tab.length);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }


    }

}
