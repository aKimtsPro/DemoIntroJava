package be.tftic.webmobile.intro.exo.oo.exceptions;

public class TooFewParticipantsException extends RuntimeException {

    private final int nbrParticipants;

    public TooFewParticipantsException(int nbrParticipants) {
        super("La competition manque de participants (%d/3 min)".formatted(nbrParticipants));
        this.nbrParticipants = nbrParticipants;
    }

    public int getNbrParticipants() {
        return nbrParticipants;
    }

}
