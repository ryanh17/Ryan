import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class quadraticTests {
    @Test
    public void quadraticTwoAns(){
        assertTrue(Math.pow(3, 2) - (4*1*-10) > 0);
        assertEquals(Main.quadraticEq(1,3,-10, 0), "x = " + 2.0 + "\n" + "x = " + -5.0);
    }

    @Test
    public void quadraticOneAns(){
        assertTrue(Math.pow(4, 2) - (4*1*4) == 0);
        assertEquals(Main.quadraticEq(1,4,4, 0), "x = " + -2.00);
    }

    @Test
    public void quadraticNoAns(){
        assertTrue(Math.pow(-1, 2) - (4*1*15) < 0);
        assertEquals(Main.quadraticEq(1,-1,15, 0), "no real solution");
    }
}
