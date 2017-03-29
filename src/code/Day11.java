package code;

import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 28-Mar-17.
 */
public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maxHourglass(arr));
    }

    static int maxHourglass(int[][] a) {
        int max = -100;
        int sum;
        int n = a.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                sum = 0;
                sum += (a[i][j] + a[i][j + 1] + a[i][j + 2]);
                sum += a[i + 1][j + 1];
                sum += (a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2]);
                if (max < sum) max = sum;
            }
        }
        return max;
    }
}
