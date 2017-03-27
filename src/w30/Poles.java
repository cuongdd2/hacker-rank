package w30;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 19-Mar-17.
 */
public class Poles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] x = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
            w[i] = scan.nextInt();
        }
    }

    static int cost(int n, int k, int[] x, int[] w) {
        // calc possible ways to group n items to k groups
        //      + try to formula in Combination
        //      + test from 1, 2 to k group
        long ways = comb(n - 1, k - 1);
        // find n = x1 + x2 + ... + xk
        // calc total cost of each arrange ways

        // find the min cost and return



        return 0;
    }

    static long comb(int n, int r) {
        return fact(n) / fact(r) / fact(n - r);
    }

    static long fact(int n) {
        long s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }
}
