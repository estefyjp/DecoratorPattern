package mx.iteso.decorator.condiments;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.decorator.Taco;

public class TortillaHarinaTest {
	private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco torillaHarina = new TortillaHarina(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = torillaHarina.cost();
        assertEquals(12.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco torillaHarina = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = torillaHarina.getDescription();
        assertEquals("Taco Normal en tortilla de harina", desc);
    }
}
