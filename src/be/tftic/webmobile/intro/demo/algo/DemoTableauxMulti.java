package be.tftic.webmobile.intro.demo.algo;

public class DemoTableauxMulti {

    public static void main(String[] args) {

        int[] tab = {1,2};

        int[][] tab2Dim = {
                { 1,2,3 },
                { 4,5,6 },
                { 7,8,9 }
        };

        int[][][] tab3Dim = {
                { {1,2}, {3,4} },
                { {5,6}, {7,8} }
        };

        int[][] plateau = new int[3][3];
        int[] range1 = plateau[0];

//        {
//            { 0, 0, 0 },
//            { 0, 0, 0 },
//            { 0, 0, 0 },
//        }

        for (int i = 0; i < plateau.length ; i++) {
            for (int j = 0; j < plateau[i].length ; j++) {
                plateau[i][j] = i+j;
            }
        }

//        {
//            { 0, 1, 2 },
//            { 1, 2, 3 },
//            { 2, 3, 4 },
//        }

    }
}
