package ds.array;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 02-Apr-17.
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        printReverse(arr);
    }

    static void printReverse(int[] a) {
        for (int i = a.length - 1; i >= 0 ; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
