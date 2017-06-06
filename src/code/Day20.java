package code;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 02-Apr-17.
 */
public class Day20 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
    }

    static void bubbleSort(int[] a) {
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            sum += numberOfSwaps;
        }

        System.out.printf("Array is sorted in %d swaps.%n", sum);
        System.out.printf("First Element: %d%n", a[0]);
        System.out.printf("Last Element: %d%n", a[a.length - 1]);
    }
}
