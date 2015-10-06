package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String size){
    	this.size=size;
        description = "Quesadilla";
    }

    @Override
    public double cost() {
    	String size = getSize();
    	Double cost = 10.0;
    	if(size.equals(MINI)){
    		cost-=1;
    	}
    	else if (size.equals(MEGA)){
    		cost+=1;
    	}
        return cost;
    }
}
