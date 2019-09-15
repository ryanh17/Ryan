import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class linearEqTest {
    @Before
    public void setup(){
    }

    @Test
    public void linearEquationTest(){
        assertEquals( Main.linearEquation(2, 4.5, 11), "x = " + 3.25);
    }
}
