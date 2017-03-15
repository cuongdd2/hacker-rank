package statistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cuongdd on 13-Mar-17.
 */
public class Day0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        meanMedianMode(x);
    }

    static void meanMedianMode(int[] x) {
        int n = x.length;
        int sum = 0;
        Arrays.sort(x);
        int count = 0;
        int max = 0;
        int mode = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            sum += x[i];
            if (curr != x[i]) {
                if (max < count) {
                    max = count;
                    mode = x[i - 1];
                }
                curr = x[i];
                count = 1;
            } else count++;
        }
        if (max < count) mode = x[n - 1];
        double median;
        if (n % 2 == 1) median = x[n / 2];
        else median = (double)(x[n/2] + x[(n - 1)/2]) / 2;
        System.out.printf("%.1f%n", (double)sum / n);
        System.out.printf("%.1f%n", median);
        System.out.println(mode);
    }

    static float weightedMean(int[] x, int[] w) {
        int n = x.length;
        int sumXW = 0;
        int sumW = 0;
        for (int i = 0; i < n; i++) {
            sumXW += x[i] * w[i];
            sumW += w[i];
        }
        return (float) sumXW / sumW;
    }

    static float median(int[] x, int n) {
        if (n % 2 == 1) return x[n / 2];
        else return (float) (x[n/2] + x[(n - 1)/2]) / 2;
    }
}
