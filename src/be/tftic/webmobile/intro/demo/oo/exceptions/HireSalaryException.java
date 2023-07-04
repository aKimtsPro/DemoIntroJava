package be.tftic.webmobile.intro.demo.oo.exceptions;

public class HireSalaryException extends RuntimeException {

    private final int salaireMax;
    private final int salaire;

    public HireSalaryException( int salaireMax, int salaire ){
        super("Cet employé ne peut engager. Son salaire est trop haut (salaireMax: %d, salaire: %d)".formatted(salaireMax, salaire));
        this.salaireMax = salaireMax;
        this.salaire = salaire;
    }

    public int getSalaireMax() {
        return salaireMax;
    }

    public int getSalaire() {
        return salaire;
    }
}
