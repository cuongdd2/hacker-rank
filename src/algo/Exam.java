package algo;

public class Exam {

    int f1(int[] a) {
        int max = -1;
        int second = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                second = max;
            } else {
                if (a[i] > second) second = a[i];
            }
        }
        return second;
    }

    int f(int[] a) {
        int sumOfOdds = 0;
        int sumOfEvens = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) sumOfEvens += a[i];
            else sumOfOdds += a[i];
        }
        return sumOfOdds - sumOfEvens;
    }

    static char[] f3(char[] a, int start, int len) {
        if (a == null || start < 0 || start > a.length - 1 || len > a.length || (start + len) > a.length) return null;

        char[] newArr = new char[len];
        for(int i = 0; i < len; i++) {
            newArr[i] = a[start + i];
        }
        return newArr;
    }

    // t
    static int f4(int[] a) {

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(f3(new char[]{'a', 'b', 'c', 'd'}, 2, 0));
    }
}
