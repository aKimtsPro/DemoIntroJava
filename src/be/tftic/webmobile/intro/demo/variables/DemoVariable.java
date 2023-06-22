package be.tftic.webmobile.intro.demo.variables;

public class DemoVariable {

    public static void main(String[] args) {

        // variable
        int monNombre = 1, simpleDecl, monDeuxiemeNombre= 2;
        // constante
        final String CHAINE = "55555";
        final char CHARACTER = 65;

        // les types primitifs
        // entiers
        byte tresPetitEntier;   // 1 octet  // [-128;127]
        short petitEntier;      // 2 octets // [-32768:32767]
        int entier;             // 4 octets // [~-2B;2B]
        long grosEntier;        // 8 octets // [-beaucoup;beaucoup]

        // réels
        float reel;             // 4 octets
        double reelPrecis;      // 8 octets

        // autres
        boolean bool;           // environ 1bit
        char character;         // 2 octets // [0; 65536]

        // Pas un primitif mais s'utilise quasi tout comme
        String chaine;          // sa taille dépend du contenu

        // expression litéral

        int a = 5;
        System.out.println( 5_000_000L );

        double monDouble = 1.;
        double monDouble2 = 1.0;
        float monFloat = 1.F;

        String chaineExpLit = "ma chaine de caractère";
        char charact = '5';
        boolean monBoolean = true;

        // Conversion de type

        int intConv = 5;
        short shortConv = (short)intConv;   // conversion explicite // nécessaire si perte de donnée possible
        long longConv = intConv;            // conversion implicite // Pas de risque de perte de données

        float floatConv = longConv;         // conversion implicite // passage de entier à reel pas de soucis
        longConv = (long)floatConv;         // conversion explicite // passage de reel à entier, perte d'info(après la virgule)

        byte byteConv = 65;
        char charConv = (char)byteConv;

        charConv++;
        System.out.println(charConv); // B - caractère correspondant à 66 dans le tableau ASCII

        if( charConv >= 'A' && charConv <= 'Z' ){
            System.out.println("C'est bien une lettre majuscule");
        }

        char nombreC = '2';
        int nombreCInt = nombreC-'0'; // je veux 0 dans mon int

        System.out.println(nombreCInt);


        String nombreDsChaine = "54";
        int nombreParse = Integer.parseInt(nombreDsChaine);
        short petitNombreParse = Short.parseShort(nombreDsChaine);
        boolean boolParsed = Boolean.parseBoolean(nombreDsChaine); // toujours false sauf si la chaine contient "true"

        char charParsed = nombreDsChaine.charAt(0);




    }

}
