package statistics;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 18-Mar-17.
 */
public class Day1_Interquartile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] X = new int[n];
        int[] F = new int[n];
        for (int i = 0; i < n; i++) {
            X[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            F[i] = scan.nextInt();
        }
        System.out.println(interquartileRange(X, F));
    }
    static float interquartileRange(int[] X, int[] F) {
        int len = X.length;
        // sort X in ascending order
        // make Y match new order of elements in X
        for (int i = 0; i < len; i++) {
            int x = X[i];
            int idx = -1;
            for (int j = i + 1; j < len; j++) {
                if (X[j] < x) {
                    x = X[j];
                    idx = j;
                }
            }
            if (idx != -1) {
                X[idx] = X[i];
                X[i] = x;
                int temp = F[i];
                F[i] = F[idx];
                F[idx] = temp;
            }
        }

        // create array S from X and F
        int n = 0;
        for (int i = 0; i < F.length; i++) {
            n += F[i];
        }
        int[] S = new int[n];
        int si = 0;
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i]; j++) {
                S[si++] = X[i];
            }
        }
        return q3(S) - q1(S);
    }


    static float q1(int[] x) {
        int n = x.length;
        int l = n / 2;
        if (l % 2 == 1) return x[l / 2];
        else return (float)(x[l/2] + x[(l - 1)/2]) / 2;
    }

    static float q3(int[] x) {
        int n = x.length / 2;
        int h = (x.length + 1) / 2;

        if (n % 2 == 1) return x[h + n / 2];
        else return (float)(x[h + n/2] + x[h + n/2 - 1]) / 2;
    }
}
