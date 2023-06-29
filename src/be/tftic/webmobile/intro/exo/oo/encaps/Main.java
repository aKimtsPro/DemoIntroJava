package be.tftic.webmobile.intro.exo.oo.encaps;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Competition competition = new Competition(); // limite de 3
        Sportif sp1 = new Sportif("luc1", "dubois", 1950);
        Sportif sp2 = new Sportif("luc2", "dubois", 1950);
        Sportif sp3 = new Sportif("luc3", "dubois", 1950);
        Sportif sp4 = new Sportif("luc4", "dubois", 1950);
        Sportif sp5 = new Sportif("luc5", "dubois", 1950);

        competition.inscrire(sp1);
        competition.inscrire(sp1);
        competition.inscrire(sp2);
        competition.inscrire(sp3);
        competition.inscrire(sp4);
        competition.inscrire(sp5);

        for (Sportif participant : competition.getParticipants()) {
            System.out.println( participant.getPrenom() );
        }

    }

}
