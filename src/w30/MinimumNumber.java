package w30;

import java.util.Scanner;

/**
 * Created by cuongdd on 14-Mar-17.
 */
public class MinimumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(minConstruct(n));
    }

    static String minConstruct(int n) {
        String s = "int";
        for (int i = 1; i < n; i++) {
            s = "min(int, " + s + ")";
        }

        return s;
    }
}
