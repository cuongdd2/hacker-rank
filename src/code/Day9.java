package code;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 28-Mar-17.
 */
public class Day9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }

    static long factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
}
