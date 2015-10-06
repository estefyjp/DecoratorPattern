package mx.iteso.decorator.tacos.tacos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Volcanes;

public class VolcanesTest {
	  @Test
	    public void testCost() {
	        Taco taco = new Volcanes("Regular");
	        assertEquals(11.0, taco.cost(),0);
	    }
}
