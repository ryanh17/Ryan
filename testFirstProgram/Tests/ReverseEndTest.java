import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * test when text.length is: 0, 1, >1
 * test when text.length()-start is: 0, 1, even > 1, odd > 1
 * test when start is: negative num, positive num, 0, 1, =text.length, 0 <= start <= text.length(), text.length - 1
 *
 */
public class ReverseEndTest {

    @Test
    public void testValidString(){
        assertEquals("Enter Valid String", ReverseEnd.reverseEnd(null,0));
        assertEquals("Enter Valid String", ReverseEnd.reverseEnd("",0));
    }

    @Test
    public void testValidStartInt(){
        assertEquals("Start Number Greater Than Text Length", ReverseEnd.reverseEnd("Hello, world",20));
        assertEquals("Start Number Must be Greater or Equal To 0", ReverseEnd.reverseEnd("Hello, world",-2));
    }

    @Test
    public void testAtZeroOrAtTextLength(){
        assertEquals("tnahpele", ReverseEnd.reverseEnd("elephant",0));
        assertEquals("elephant", ReverseEnd.reverseEnd("elephant",8));
    }

    @Test
    public void testReversedOutput(){
        assertEquals("eletnahp", ReverseEnd.reverseEnd("elephant",3));
        assertEquals("hellodlrow ,", ReverseEnd.reverseEnd("Hello, world",5));
    }

}