package main;

import main.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathTest {

    @Test
    void testXiAbs() {
        assertEquals(5, MathUtils.xiAbs(-5));
        assertEquals(7003, MathUtils.xiAbs(7003));
        assertEquals(888888888888L, MathUtils.xiAbs(888888888888L));
        assertEquals(12.345, MathUtils.xiAbs(-12.345));
    }

    @Test
    void testXiMinMax() {
        assertEquals(19, MathUtils.xiMax(10, 19));
        assertEquals(-999, MathUtils.xiMin(0, -999));
        assertEquals(9, MathUtils.xiMax(9, 9));
    }

    @Test
    void testXiPow() {
        assertEquals(6561, MathUtils.xiPow(9, 4));
    }

    @Test
    void testXiSqrt() {
        assertEquals(Math.sqrt(2), MathUtils.xiSqrt(2), 1e-13);
    }
}
