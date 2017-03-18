package statistics;

/**
 * Created by cuongdd2@gmail.com on 18-Mar-17.
 */
public class Day4_BinominalDistribution {
    public static void main(String[] args) {
        pistonFactory();
    }

    static void russianBoys() {
        int n = 6;
        double p = 1.09 / (1.09 + 1);
        double sum = 0;
        for (int x = 3; x <= n; x++) {
            sum += binominalDistribution(x, n, p);
        }
        System.out.printf("%.3f", sum);
    }

    static void pistonFactory() {
        int n = 10;
        double p = 0.12;
        double atMost = 0;
        for (int x = 0; x <= 2; x++) {
            atMost += binominalDistribution(x, n, p);
        }
        System.out.printf("%.3f%n", atMost);
        double atLeast = 0;
        for (int x = 2; x <= n; x++) {
            atLeast += binominalDistribution(x, n, p);
        }
        System.out.printf("%.3f%n", atLeast);
    }

    /** formula: nCx * p^x & (1 - p)^(n-x) */
    static double binominalDistribution(int x, int n, double p) {
        return factorial(n) / factorial(x) / factorial(n - x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
    }

    static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
