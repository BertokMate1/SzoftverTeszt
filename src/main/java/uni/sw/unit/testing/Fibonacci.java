package uni.sw.unit.testing;

public class Fibonacci {

    public static int calculateFibonacci(int n) {
        if (n <= 1) return n;
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public int getFibonacciNumber(int n) {
        return calculateFibonacci(n);
    }
}
