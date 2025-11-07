package main;

public class QuickTest {
    public static void main(String[] args) {
        System.out.println("=== Testing StringUtils ===");

        // Test xiTrim
        testXiTrim();

        // Test xiSqrt
        testXiSqrt();
    }

    static void testXiTrim() {
        System.out.println("\n--- Testing xiTrim ---");
        String[] testCases = {
                "  hello  ",
                "hello",
                "   ",
                "  a  b  ",
                null
        };

        for (String test : testCases) {
            String result = StringUtils.xiTrim(test);
            System.out.printf("xiTrim('%s') = '%s'%n", test, result);
        }
    }

    static void testXiSqrt() {
        System.out.println("\n--- Testing xiSqrt ---");
        double[] testCases = {0, 25, 36.9, 60, 104, 0.06, -7};

        for (double test : testCases) {
            double result = MathUtils.xiSqrt(test);
            double expected = Math.sqrt(test);
            double error = Math.abs(result - expected);
            System.out.printf("xiSqrt(%.1f) = %.6f (expected: %.6f, error: %.2e)%n",
                    test, result, expected, error);
        }
    }
}
