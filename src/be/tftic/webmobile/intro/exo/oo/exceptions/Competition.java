package be.tftic.webmobile.intro.exo.oo.exceptions;

import java.util.HashSet;

public class Competition {

    private final int limite;
    private final HashSet<Sportif> participants = new HashSet<>();
    private Sportif gagnant;

    public Competition() {
        this.limite = 3;
    }

    public Competition(int limite) {
        this.limite = Math.max(limite, 3);
    }

    public int getLimite() {
        return limite;
    }

    public Sportif getGagnant() {
        if( !aEteLancee() )
            throw new CompetitionNotStartedException();

        return gagnant;
    }

    public HashSet<Sportif> getParticipants() {
        // return participants; // Si on renvoie la liste elle pourrait être modifiée de l'extérieur
        return new HashSet<>( participants );
    }

    public void inscrire(Sportif aInscrire){
        if( this.aEteLancee() )
            throw new CompetitionAlreadyStartedException();

        if( participants.size() < limite )
            this.participants.add(aInscrire);
    }

    public boolean desinscrire(Sportif aDesinscrire){
        if( this.aEteLancee() )
            throw new CompetitionAlreadyStartedException();

        return this.participants.remove( aDesinscrire );
    }


    public void lancer(){
        if( participants.size() < 3 )
            throw new TooFewParticipantsException(participants.size());

        if( aEteLancee() )
            throw new CompetitionAlreadyStartedException();

        int meilleurPerf = -1;
        // si on met 0, dans le cas ou tous les sportifs font un score de 0, on ne trouve pas de gagnant
        Sportif meilleurSportif = null;
        for (Sportif participant : participants) {
            int performance = participant.performer();
            if( performance > meilleurPerf ){
                meilleurPerf = performance;
                meilleurSportif = participant;
            }
        }
        this.gagnant = meilleurSportif;
    }

    public boolean aEteLancee(){
        return this.gagnant != null;
    }

}
