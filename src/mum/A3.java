package mum;

public class A3 {
    public static void main(String[] args) {
        isDigitIncreasing(7);
        isDigitIncreasing(36);
        isDigitIncreasing(984);
        isDigitIncreasing(7404);
        isDigitIncreasing(37);
    }

    static int isDigitIncreasing(int n) {
        if (n <= 0) return 0;

        int len = (int)Math.floor(Math.log10(n)) + 1;

        int sum;
        for (int no = len; no > len - 2 && no > 0; no--) {
            for (int x = 1; x <= 9; x++) {
                sum = 0;
                for (int i = 1; i <= no; i++) {
                    sum += repeatX(x, i);
                }
                if (sum == n) return 1;
            }
        }

        return 0;
    }

    static int repeatX(int x, int time) {
        int sum = 0;
        for (int i = 0; i < time; i++) {
            sum += x * Math.pow(10, i);
        }
        return sum;
    }
}
