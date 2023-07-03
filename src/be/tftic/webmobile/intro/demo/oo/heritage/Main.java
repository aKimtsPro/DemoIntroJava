package be.tftic.webmobile.intro.demo.oo.heritage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Personne pers = new Employe("","",2000);
        Employe emp = (Employe) pers;

        if( pers instanceof Employe )
            System.out.println("c'est bien un employé");
        else
            System.out.println("C'est pas un employé");

//        Personne pers2 = new Personne("luc", "dubois", 49);
//        System.out.println( ((Employe)pers2).getSalaire() ); // ClassCastException

        ArrayList<Personne> list = new ArrayList<>();
        list.add( new Personne("luc", "dubois", 49) );
        list.add( pers );

        for (Personne personne : list) {
            if( personne instanceof Employe ){
                System.out.println( personne.getPrenom() + " - " + ((Employe)personne).getSalaire() );
            }
        }


        System.out.println("\n\n------ Override ------");
        Personne p = new Employe("Marie", "Dubuisson", 2500);
        System.out.println( p.getSalutation() ); // Salut!
        Manager m = new Manager();
        System.out.println( m.getSalutation() ); // Salut! // execute la version la plus proche en terrme d'héritage


        System.out.println("\n\n------ toString et equals -----");
        System.out.println(m);

        Manager m1 = new Manager();
        m1.setSalaire(2);
        Manager m2 = new Manager();
        m2.setSalaire(1);

        System.out.println( m1 == m2 );         // false
        System.out.println( m1.equals(m2) );    // true

    }

}
