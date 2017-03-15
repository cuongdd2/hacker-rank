package euler;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by cuongdd on 09-Mar-17.
 */
public class Problem174 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        HashMap<Integer, Integer> hm = new HashMap<>(1000000 - 4);
//        for (int i = 4; i <= 1000000; i++) {
//            hm.put(i, calc(i));
//        }

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int k = in.nextInt();
            System.out.println(calc(k));
        }
    }

    static int calc(int k) {
        int[] Nk = new int[k + 1];
        int max = (k - 4) / 4;
        for (int a = 1; a <= max; a++) {
            int maxN = (int)Math.floor(Math.sqrt(k));
            for (int n = 2; n < maxN; n += 2) {
                int t = n * n + 2 * a * n;
                if (t <= k) Nk[t]++;
                else break;
            }
        }

        int sum = 0;
        for (int i = 0; i < Nk.length; i++) {
            if (Nk[i] > 8) {
                System.out.println(i);
                System.out.println(Nk[i]);
            }
        }

        return sum;
    }
}
