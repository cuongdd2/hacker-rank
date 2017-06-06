package code;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 29-Mar-17.
 */
class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] a) {
        elements = a;
    }

    void computeDifference() {
        int max = 1, min = 100;
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            if (max < elements[i]) max = elements[i];
            if (min > elements[i]) min = elements[i];
        }

        maximumDifference = max - min;
    }
}

class Solution14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
