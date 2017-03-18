package code;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 18-Mar-17.
 */
public class Day6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scan.next();
            print(s);
        }
    }

    static void print(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        String evens = "";
        String odds = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) evens += c[i];
            else odds += c[i];
        }
        System.out.println(evens + " " + odds);
    }
}
