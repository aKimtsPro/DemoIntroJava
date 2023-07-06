package be.tftic.webmobile.intro.exo.oo.exceptions;

import be.tftic.webmobile.intro.exo.oo.enums.Categorie;

public class Main {

    public static void main(String[] args) {

        Competition competition = new Competition(3);

        Boxeur b1 = new Boxeur("luc", "dubois", 1990, Categorie.LOURD);
        Boxeur b2 = new Boxeur("marie", "dubois", 1990, Categorie.LOURD);
        Boxeur b3 = new Boxeur("dominique", "dubois", 1990, Categorie.LOURD);


//        System.out.println( competition.getGagnant() );// => CompetitionNotStartedExc.
//        competition.lancer(); // => TooFewParticipantsExc.

        competition.inscrire(b1);
        competition.inscrire(b2);
        competition.inscrire(b3);

        competition.lancer();

        System.out.println( competition.getGagnant() );

//        competition.lancer(); // => CompetitionAlreadyStarted

//        competition.desinscrire(b1); // => CompetitionAlreadyStarted
//        competition.inscrire(b1); // => CompetitionAlreadyStarted

    }

}
