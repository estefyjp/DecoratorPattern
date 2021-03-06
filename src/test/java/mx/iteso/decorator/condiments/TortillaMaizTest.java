package mx.iteso.decorator.condiments;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.decorator.Taco;

public class TortillaMaizTest {
	private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco torillaMaiz = new TortillaMaiz(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = torillaMaiz.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco torillaMaiz = new TortillaMaiz(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = torillaMaiz.getDescription();
        assertEquals("Taco Normal en tortilla de maíz", desc);
    }
}
