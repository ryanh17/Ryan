import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlanetTests {
    Planet planetTests;
    Planet planetTests2;

    @Before
    public void setup(){
        planetTests = new Planet(65, "Pluto");
        planetTests2 = new Planet(65, "Pluto");
    }

    @Test
    public void testEqualsMethodTrue(){
        assertEquals(true, planetTests.equals(planetTests2));
    }

    @Test
    public void testEqualsMethodFalse(){
        
    }

}
