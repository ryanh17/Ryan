import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlanetTests {
    Planet planetTests;
    Planet planetTests2;
    Planet planetTestsFalse;

    @Before
    public void setup(){
        planetTests = new Planet(65, "Pluto");
        planetTests2 = new Planet(65, "Pluto");
        planetTestsFalse = new Planet(55, "Venus");
    }

    @Test
    public void testEqualsMethodTrue(){
        assertEquals(true, planetTests.equals(planetTests2));
    }

    @Test
    public void testEqualsMethodFalse(){
        assertEquals(false, planetTests.equals(planetTestsFalse));
    }

}
