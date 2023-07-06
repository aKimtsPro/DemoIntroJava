package be.tftic.webmobile.intro.exo.oo.exceptions;

public class CompetitionAlreadyStartedException extends IllegalStateException {

    public CompetitionAlreadyStartedException(){
        super("La compétition a déjà été commencée");
    }

}
