package be.tftic.webmobile.intro.demo.lambdas;

@FunctionalInterface
public interface InterfaceFonctionnelle {

    void methode();
    static void methode2(){
        System.out.println("méthode déjà définie");
    }

    default void methode3(){
        System.out.println("méthode déjà définie");
    }

}
