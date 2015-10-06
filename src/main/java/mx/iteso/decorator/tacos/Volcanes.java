package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;


public class Volcanes extends Taco {
    public Volcanes(String size){
        description = "Volcanes";
        super.size=REGULAR;

    }

    @Override
    public double cost() {
        return 11.00;
    }
}
