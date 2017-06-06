package ds.array;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 02-Apr-17.
 */
public class SparseArrays {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = scan.next();
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String given = scan.next();
            count(s, given);
        }
    }

    static void count(String[] s, String given) {
        int c = 0;
        for (String e : s) {
            if (given.equals(e)) c++;
        }
        System.out.println(c);
    }


}
