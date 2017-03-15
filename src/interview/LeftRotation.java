package interview;

import java.util.Scanner;

/**
 * Created by cuongdd on 10-Mar-17.
 */
public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] arr = rotate(a, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(" ");
        }
    }

    static int[] rotate(int[] a, int k) {
        int l = a.length;
        int[] n = new int[l];

        for (int i = 0; i < l; i++) {
            n[i] = a[(i + k) % l];
        }
        return n;
    }
}
