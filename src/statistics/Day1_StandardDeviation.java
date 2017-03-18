package statistics;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 18-Mar-17.
 */
public class Day1_StandardDeviation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        System.out.printf("%.1f", standardDeviation(n, x));
    }

    static double standardDeviation(int n, int[] x) {
        float mean = mean(x);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (x[i] - mean) * (x[i] - mean);
        }
        return Math.sqrt(sum / n);
    }

    static float mean(int[] x) {
        int n = x.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += x[i];
        }
        return (float)sum / n;
    }
}
