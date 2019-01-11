package solution;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private static Solution zerosCounter;
    private int count = 0;

    @BeforeAll
    public static void init() {
        zerosCounter = new Solution();
    }

    @Test
    void whenGapsPresent() throws UnsupportedOperationException {
        count = zerosCounter.solution(16777642);
        assertEquals(15,count);
    }

    @Test
    void whenNoGapsDueToPerfectRootSquare() throws UnsupportedOperationException {
        count = zerosCounter.solution(4096);
        assertEquals(0,count);
    }

    @Test
    void whenNoGapsAsOnlyOnesArePresent() throws UnsupportedOperationException {
        count = zerosCounter.solution(4095);
        assertEquals(0,count);
    }

    @Test
    void whenExceptionRaisedDueToNegativeInput() throws UnsupportedOperationException {
        assertThrows(UnsupportedOperationException.class,
                () -> zerosCounter.solution(-50));
    }

    @Test
    void whenBinaryValueContainsZeroOnly() throws UnsupportedOperationException {
        count = zerosCounter.solution(0);
        assertEquals(0,count);
    }

    @Test
    void whenBinaryValueContainsOneOnly() throws UnsupportedOperationException {
        count = zerosCounter.solution(1);
        assertEquals(0,count);
    }

    @Test
    void whenBinaryValueRepresentsMaxInt() throws UnsupportedOperationException {
        count = zerosCounter.solution(2147483647);
        assertEquals(0,count);
    }




}
