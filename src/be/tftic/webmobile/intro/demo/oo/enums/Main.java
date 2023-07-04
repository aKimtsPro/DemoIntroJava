package be.tftic.webmobile.intro.demo.oo.enums;

public class Main {

    public static void main(String[] args) {
        TemperatureUnite unite = TemperatureUnite.CELCIUS;
        // impossible d'instancier une énumération
//        unite = new TemperatureUnite('P');
        // null est une valeur acceptable
        // unite = null;

        switch ( unite ){
            case KELVIN -> System.out.println("en kelvin");
            case CELCIUS -> System.out.println("en celcius");
            case FARHENHEIT -> System.out.println("en farhenheit");
            default -> System.out.println("aucun des trois");
        }

        // methodes utiles sur les enumérations:
        for (TemperatureUnite value : TemperatureUnite.values()) {
            System.out.println(value);
        }
        // convertir String -> enum
        unite = TemperatureUnite.valueOf("KELVIN");
        // convertir enum -> String
        String nom = unite.name();



    }

}
