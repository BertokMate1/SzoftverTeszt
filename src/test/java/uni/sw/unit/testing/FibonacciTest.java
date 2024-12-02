package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void testEighthFibonacci() {
        assertEquals(21, Fibonacci.calculateFibonacci(8), "The 8th Fibonacci number should be 21");
    }

    @Test
    void testTwentyThirdFibonacci() {
        assertEquals(28657, Fibonacci.calculateFibonacci(23), "The 23rd Fibonacci number should be 28657");
    }
}
