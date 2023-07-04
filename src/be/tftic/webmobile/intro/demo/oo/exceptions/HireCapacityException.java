package be.tftic.webmobile.intro.demo.oo.exceptions;

public class HireCapacityException extends RuntimeException{

    public HireCapacityException(){
        super("Capacité d'engagement excedée.");
    }

}
