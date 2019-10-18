import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoonTests {
    Moon moonTestTrue;
    Moon moonTestTrue2;
    Moon moonTestFalse;

    @Before
    public void setup(){
        moonTestTrue = new Moon(new Planet(65, "Pluto"),65,false, "Pluto");
        moonTestTrue2 = new Moon(new Planet(65, "Pluto"),65,false, "Pluto");
        moonTestFalse = new Moon(new Planet(55, "Venus"),55,false, "Venus");
    }

    @Test
    public void testEqualsMethodTrue(){
        assertEquals(true, moonTestTrue.equals(moonTestTrue2));
    }

    @Test
    public void testEqualsMethodFalse(){
        assertEquals(false, moonTestTrue.equals(moonTestFalse));
    }
}
