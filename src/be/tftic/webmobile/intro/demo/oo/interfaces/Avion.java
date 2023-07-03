package be.tftic.webmobile.intro.demo.oo.interfaces;

public class Avion extends Vehicule implements IVolant, IRouler {

    private final String modele;

    public Avion(String marque, String modele) {
        super(marque);
        this.modele = modele;
    }

    @Override
    public void voler(){
        System.out.println("viou je vole");
    }

    @Override
    public void planer() {
        System.out.println("L'avion éteind ses moteurs");
    }

    public String getModele() {
        return modele;
    }

    @Override
    public void rouler() {
        System.out.println("l'avion roule");
    }
}
