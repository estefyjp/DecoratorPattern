package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish (Taco taco){
    	if(taco.getSize()=="Mini"){
    		return;
    	}
    	else
    		this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
    	if(taco.getSize()=="Mega"){
            return 1.00 + taco.cost();

    	}

        return 0 + taco.cost();
    }
}