package code;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 18-Mar-17.
 */
public class Day5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printMutiples(n);
    }

    static void printMutiples(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
}
