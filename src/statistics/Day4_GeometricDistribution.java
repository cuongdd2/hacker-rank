package statistics;

/**
 * Created by cuongdd2@gmail.com on 18-Mar-17.
 */
public class Day4_GeometricDistribution {
    public static void main(String[] args) {
        double p = (float)1/3;
        int n = 5;
        double first5 = 0;
        for (int i = 1; i <= n; i++) {
            first5 += geometricDist(i, p);
        }
        System.out.printf("%.3f", first5);
    }

    /**
     * Formula g(n, p) = (1-p)^(n-1) * p
     **/
    static double geometricDist(int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }
}
