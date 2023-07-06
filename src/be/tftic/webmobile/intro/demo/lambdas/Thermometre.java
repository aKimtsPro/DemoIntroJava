package be.tftic.webmobile.intro.demo.lambdas;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Thermometre {

    private double temperature = 0;

    private List<Consumer<Double>> abonnements = new LinkedList<>();

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        for (Consumer<Double> abonnement : abonnements) {
            abonnement.accept( this.temperature );
        }
    }

    public void sAbonner(Consumer<Double> abonnement){
        this.abonnements.add(abonnement);
    }
}
