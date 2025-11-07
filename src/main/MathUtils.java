package main;

public class MathUtils {

    public static int xiAbs(int value) {
        return (value >= 0) ? value : value * -1;
    }

    public static long xiAbs(long value) {
        return (value >= 0) ? value : value * -1;
    }

    public static double xiAbs(double value) {
        return (value >= 0) ? value : value * -1;
    }

    public static int xiMax(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int xiMin(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static double xiMin(double a, double b) {
        return (a <= b) ? a : b;
    }

    public static double xiPow(double base, int exponent) {
        double value = 1;
        for (int i = 0; i < exponent; i++) {
            value = value * base;
        }
        return value;
    }

    public static double xiSqrt(double value) {
        if (value < 0) return Double.NaN;
        if (value == 0) return 0;
        if (value == 1) return 1;

        double inf = (value > 1) ? 1 : value;
        double sup = (value > 1) ? value : 1;
        while (sup - inf > 1e-10) {
            double guess = (sup + inf) / 2;
            if (guess * guess < value) {
                inf = guess;
            }
            else
                sup = guess;
        }
        double infSquared = inf * inf;
        double supSquared = sup * sup;
        return (xiAbs(supSquared - value) <= xiAbs(infSquared - value))
                ? sup : inf;
    }

    public static int xiFactorial(int n) {
        if (n < 0)
            return 0; // undefined for negative numbers
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value = value * i;
        }
        return value;
    }

    public static boolean xiIsPrime(int number) {
        return  true;
    }
}
