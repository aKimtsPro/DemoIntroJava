package be.tftic.webmobile.intro.demo.oo.interfaces;

public class Oiseau extends Animal implements IVolant {

    private final String espece;

    @Override
    public void voler(){
        System.out.println("flapflap je vole");
    }

    @Override
    public void planer() {
        System.out.println("L'oiseau étend ses ailes");
    }

    public Oiseau(String nom, String espece) {
        super(nom);
        this.espece = espece;
    }
}
