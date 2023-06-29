package be.tftic.webmobile.intro.exo.oo.encaps;

import java.util.ArrayList;
import java.util.HashSet;

public class Competition {

    private final int limite;
    private final HashSet<Sportif> participants = new HashSet<>();

    public Competition() {
        this.limite = 3;
    }

    public Competition(int limite) {
        this.limite = Math.max(limite, 3);
    }

    public int getLimite() {
        return limite;
    }

    public HashSet<Sportif> getParticipants() {
        // return participants; // Si on renvoie la liste elle pourrait être modifiée de l'extérieur
        return new HashSet<>( participants );
    }

    public void inscrire(Sportif aInscrire){
        if( participants.size() < limite )
            this.participants.add(aInscrire);
    }

    public boolean desinscrire(Sportif aDesinscrire){
        return this.participants.remove( aDesinscrire );
    }


}
