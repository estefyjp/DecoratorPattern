package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
    	String size = getSize();
    	if(size.equals(MINI)){
            return 1.00 + taco.cost();
    	}
    	else if (size.equals(MEGA)){
            return 3.00 + taco.cost();
    	}
        return 2.00 + taco.cost();
    }
}
