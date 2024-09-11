package org.example;

public class FibonachiCalculator {
    private static final String FIBONACHI_EXCEPTION = "Amount can't be negative";
    public static int fibonachiOne(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(FIBONACHI_EXCEPTION);
        }
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1, result = 1;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static int fibonachiTwo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(FIBONACHI_EXCEPTION);
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonachiTwo(n - 1) + fibonachiTwo(n - 2);
    }

    public static int fibonachiThree(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(FIBONACHI_EXCEPTION);
        }
        if (n == 0 || n == 1) {
            return n;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

}
