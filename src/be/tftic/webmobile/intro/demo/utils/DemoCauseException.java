package be.tftic.webmobile.intro.demo.utils;

public class DemoCauseException {

    public static void main(String[] args) {
        methodA();
    }

    public static void methodA(){
        try {
            methodB();
        }
        catch (Exception e){
            throw new RuntimeException("Moins bizarre", e);
        }
    }

    public static void methodB(){
        throw new RuntimeException("Bizarre");
    }

}
