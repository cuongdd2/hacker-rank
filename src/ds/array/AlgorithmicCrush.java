package ds.array;

import java.util.*;

/**
 * Created by cuongdd2@gmail.com on 02-Apr-17.
 */
public class AlgorithmicCrush {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] list = new long[N + 1];
        java.util.Arrays.fill(list, 0);
        int M = scan.nextInt();
        long max = 0;
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            list[a] += k;
            if (b + 1 <= N) list[b + 1] -= k;
        }
        long curr = 0;
        for (int i = 1; i <= N; i++) {
            curr += list[i];
            if (max < curr) max = curr;
        }
        System.out.println(max);
    }
}
