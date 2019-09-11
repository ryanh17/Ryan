import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class cubeRootTest {
    @Before
    public void setup(){
        Main.cubeRoot(8);
    }

    @Test
    public void cubeRootableNum(){
        assertEquals(Main.temp, 2.0, 0);
        assertEquals(Main.cubeRoot(8), 2.0, 0);
    }

    @Test
    public void nonRootableNum(){
        Main.cubeRoot(5);
        assertEquals(Main.temp, 1.709975946676697, 0);
        assertEquals(Main.cubeRoot(5), 1.71,0);
    }
}
