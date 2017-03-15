package statistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cuongdd on 13-Mar-17.
 */
public class Day1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        Arrays.sort(x);
        System.out.println(g1(x));
        System.out.println(g2(x));
        System.out.println(g3(x));
    }


    static int g1(int[] x) {
        int n = x.length;
        int l = n / 2;
        if (l % 2 == 1) return x[l / 2];
        else return (x[l/2] + x[(l - 1)/2]) / 2;
    }

    static int g2(int[] x) {
        int n = x.length;
        if (n % 2 == 1) return x[n / 2];
        else return (x[n>>1] + x[(n - 1)>>1]) / 2;
    }

    static int g3(int[] x) {
        int n = x.length / 2;
        int h = (x.length + 1) / 2;

        if (n % 2 == 1) return x[h + n / 2];
        else return (x[h + n/2] + x[h + n/2 - 1]) / 2;
    }

}
