package hr19;

import java.util.Scanner;

/**
 * Created by cuongdd on 16-Mar-17.
 */
public class LisaWorkbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        System.out.println(page(k, t));
    }



    static int page(int k, int[] t) {
        int n = t.length;
        int cp = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= t[i]; j++) {
                if (j % k == 1 || k == 1) cp++;
                if (j == cp) count++;
            }
        }
        return count;
    }



}
