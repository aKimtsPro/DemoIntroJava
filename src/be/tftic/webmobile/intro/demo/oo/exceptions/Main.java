package be.tftic.webmobile.intro.demo.oo.exceptions;

import be.tftic.webmobile.intro.demo.oo.heritage.Employe;

public class Main {

    public static void main(String[] args) {

        Entreprise entreprise = new Entreprise(3000, "l'entreprise");
        Employe employe = new Employe("ok", "ok", 3500);

        try {
            entreprise.engager(employe);
        }
        catch (HireSalaryException e) { // Exception est un enfant de Throwable
            System.out.println( e.getMessage() );
            System.out.println( e.getSalaire() );
        }
        catch (HireCapacityException e){
//            System.out.println( e.getMessage() );
            System.out.println( "Capacity exceeded" );
        }
        catch (RuntimeException e){
            System.out.println("ni une HireSalaryException ni une HireCapacity");
        }


        System.out.println("Fin du programme");
    }
}
