package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        description = "Taco normal" + size;
        this.size=size;
    }

    @Override
    public double cost() {
    	String size = getSize();
    	Double cost = 8.0;
    	if(size.equals(MINI)){
    		cost-=1;
    	}
    	else if (size.equals(MEGA)){
    		cost+=1;
    	}
        return cost;
    }
}
