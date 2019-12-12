import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 Testing Strategy

 Partition inputs as follows:
 0, 1, 12, -1, 7

 Include 0 and negative numbers to ensure returns null
 One even (12) and one Odd(7) start point
 */

public class ComputeStuffTest {
    /**
     * Tests a postive even number (12)
     */

    @Test
    public void hailstoneSequenceEven() {
        List<Integer> expected = new ArrayList<>();
        expected.add(12);
        expected.add(6);
        expected.add(3);
        expected.add(10);
        expected.add(5);
        expected.add(16);
        expected.add(8);
        expected.add(4);
        expected.add(2);
        expected.add(1);
        assertThat(ComputeStuff.hailstoneSequence(12), is(expected));
    }

    /**
     * Tests and odd positive number (7)
     */
    @Test
    public void hailstoneSequenceOdd(){
        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(22);
        expected.add(11);
        expected.add(34);
        expected.add(17);
        expected.add(52);
        expected.add(26);
        expected.add(13);
        expected.add(40);
        expected.add(20);
        expected.add(10);
        expected.add(5);
        expected.add(16);
        expected.add(8);
        expected.add(4);
        expected.add(2);
        expected.add(1);
        assertThat(ComputeStuff.hailstoneSequence(7), is(expected));
    }

    /**
     * Tests if n = 0
     */
    @Test
    public void hailStoneZero(){
        List<Integer> expected = new ArrayList<>();
        expected.add(-1);
        assertThat(ComputeStuff.hailstoneSequence(0), is(expected));
    }

    /**
     * Tests if n = 1
     */
    @Test
    public void hailStoneOne(){
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertThat(ComputeStuff.hailstoneSequence(1),is(expected));
    }

    /**
     * Tests if n &lt; 1
     */
    @Test
    public void hailStoneNegative(){
        List<Integer> expected = new ArrayList<>();
        expected.add(-1);
        assertThat(ComputeStuff.hailstoneSequence(-1), is(expected));
    }
}