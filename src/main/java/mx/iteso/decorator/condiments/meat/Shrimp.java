package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp (Taco taco){
    	if(taco.getSize()=="Mini"){
    		return;
    	}
    	else
    		this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camar�n";
    }

    @Override
    public double cost() {
    	if(taco.getSize()=="Mega"){
            return 1.00 + taco.cost();

    	}
        return 0 + taco.cost();
    }
}