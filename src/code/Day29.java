package code;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            System.out.println(bitwise(N, K));
        }
    }

    private static int bitwise(int N, int K) {
        int max = 0;
        for (int A = 1; A < N; A++) {
            for (int B = A + 1; B <= N; B++) {
                int bw = A & B;
                if (bw < K && bw > max) {
                    max = bw;
                    if (max == K - 1) return max;
                }
            }
        }
        return max;
    }
}
