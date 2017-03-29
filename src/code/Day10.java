package code;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 28-Mar-17.
 */
public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int n = in.nextInt();
            System.out.println(maxConsecutive(n));
        }
    }

    static int maxConsecutive(int n) {
        int max = 0;
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) count++;
            else {
                if (max < count) max = count;
                count = 0;
            }
            n /= 2;
        }
        return count > max ? count : max;
    }
}
