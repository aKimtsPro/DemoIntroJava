package be.tftic.webmobile.intro.exo.oo.exceptions;

public class CompetitionNotStartedException extends IllegalStateException {
    public CompetitionNotStartedException() {
        super("La compétition n'a pas encore été lancée");
    }
}
