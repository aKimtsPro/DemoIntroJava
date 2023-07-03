package be.tftic.webmobile.intro.demo.oo.heritage;

public class Manager extends Employe {

    public Manager(){
        super("Boss", "Big", 255594);
    }

    // Rédéfinition optionel: Employé a déjà redéfini la méthode sous forme 'concrète'
//    @Override
//    public void travailler() {
//        super.travailler();
//    }
}
