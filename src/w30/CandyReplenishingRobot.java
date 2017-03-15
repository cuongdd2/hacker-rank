package w30;

import java.util.Scanner;

/**
 * Created by cuongdd on 14-Mar-17.
 */
public class CandyReplenishingRobot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        System.out.println(addedCandies(n, t, c));
    }

    static int addedCandies(int n, int t, int[] c) {
        int total = 0;
        int b = n;
        for (int i = 0; i < t; i++) {
            b -= c[i];
            if (i < t - 1 && b < 5) {
                total += n - b;
                b = n;
            }
        }
        return total;
    }


}
