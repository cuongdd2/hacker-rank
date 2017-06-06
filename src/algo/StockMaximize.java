package algo;

/**
 * Created by cuongdd2@gmail.com on 03-Apr-17.
 */
public class StockMaximize {
    public static void main(String[] args) {

    }

    static long calcProfit(int[] prices) {
        long max = 0;
        long total = 0;
        long balance = 0;
        for (int i = 0; i < prices.length; i++) {
            if (max == 0) max = findMax(i, prices);
            if (prices[i] == max) {
                if (total > 0) {
                    balance += total * max;
                    total = 0;
                }
                max = 0;
            } else {
                total++;
                balance -= prices[i];
            }
        }
        System.out.println(balance);
        return balance;
    }

    static long findMax(int k, int[] arr) {
        long max = arr[k];
        for(int i = k + 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
}
