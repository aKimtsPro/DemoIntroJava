package be.tftic.webmobile.intro.demo.oo.exceptions;

import be.tftic.webmobile.intro.demo.oo.heritage.Employe;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

    private static final int PERSONNEL_MAX = 2;
    private final int salaireMax;
    private final List<Employe> employes = new ArrayList<>();
    private final String nom;

    public Entreprise(int salaireMax, String nom) {
        this.salaireMax = salaireMax;
        this.nom = nom;
    }

    public void engager(Employe employe) /*throws Exception*/ {
//        if( employe.getSalaire() > salaireMax )
//            throw new Exception("impossible d'engager des employés ayant un salaire sup. à" + salaireMax);
//        if( employe.getSalaire() > salaireMax )
//            throw new RuntimeException("impossible d'engager des employés ayant un salaire sup. à" + salaireMax);
//        if( employe.getSalaire() > salaireMax )
//            throw new IllegalArgumentException("impossible d'engager des employés ayant un salaire sup. à" + salaireMax)
        if( employe.getSalaire() > salaireMax )
            throw new HireSalaryException(this.salaireMax, employe.getSalaire());

        if( employes.size() == PERSONNEL_MAX )
            throw new HireCapacityException();

        // Exception -> checked -> propagation explicite -> throws ... nécessaire
        // RuntimeException -> unchecked -> propagation implicite -> throws ... pas nécessaire

        this.employes.add(employe);
    }



    public List<Employe> getEmployes() {
        return new ArrayList<>(employes);
    }

    public String getNom() {
        return nom;
    }
}
