package uni.sw.unit.testing.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import uni.sw.unit.testing.Fibonacci;

public class FibonacciMockTest {

    @Test
    void testFifteenthFibonacci() {
        Fibonacci mockFibonacci = mock(Fibonacci.class);
        when(mockFibonacci.getFibonacciNumber(15)).thenReturn(610);
        assertEquals(610, mockFibonacci.getFibonacciNumber(15), "The 15th Fibonacci number should be 610");
    }

    @Test
    void testTwentiethFibonacci() {
        Fibonacci mockFibonacci = mock(Fibonacci.class);
        when(mockFibonacci.getFibonacciNumber(20)).thenReturn(6765);
        assertEquals(6765, mockFibonacci.getFibonacciNumber(20), "The 20th Fibonacci number should be 6765");
    }
}
