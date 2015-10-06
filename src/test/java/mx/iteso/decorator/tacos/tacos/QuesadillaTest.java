package mx.iteso.decorator.tacos.tacos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;

public class QuesadillaTest {
	  @Test
	    public void testCost() {
	        Taco taco = new Quesadilla("Regular");
	        assertEquals(10.0, taco.cost(),0);
	    }
}
