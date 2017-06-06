package algo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cuongdd on 08-Mar-17.
 */
public class Util {


    static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
    static int gcd(int[] a) {
        if (a.length == 1) return a[0];
        else if (a.length == 2) return gcd(a[0], a[1]);
        else return gcd(a[0], gcd(Arrays.copyOfRange(a, 1, a.length)));
    }
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    static int lcm(int[] a) {
        if (a.length == 1) return a[0];
        else if (a.length == 2) return lcm(a[0], a[1]);
        else return lcm(a[0], lcm(Arrays.copyOfRange(a, 1, a.length)));
    }


    static int maxDivisible(int n, int k, int[] a) {
        int[] mod = new int[k];
        for (int i = 0; i < n; i++) {
            mod[a[i] % k]++;
        }

        int count = 0;

        for (int i = 1; i <= (k - 1) / 2; i++) {
            if (mod[i] > mod[k - i]) {
                count += mod[i];
            } else count += mod[k - i];
        }
        if (mod[0] > 0) count++;
        if (k % 2 == 0) count++;

        return count;
    }

    static void nextPermutation() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();

            char[] chars = s.toCharArray();
            boolean found = false;
            for (int j = chars.length - 1; j > 0; j--) {
                if (chars[j] > chars[j - 1]) {
                    char min = chars[j];
                    int mi = j;
                    for (int k = j + 1; k < chars.length; k++)
                        if (min > chars[k] && chars[k] > chars[j - 1]) {
                            min = chars[k];
                            mi = k;
                        }
                    chars[mi] = chars[j - 1];
                    chars[j - 1] = min;
                    found = true;
                    for (int k = j; k < chars.length - 1; k++) {
                        for (int l = k + 1; l < chars.length; l++) {
                            if (chars[k] > chars[l]) {
                                char temp = chars[k];
                                chars[k] = chars[l];
                                chars[l] = temp;
                            }
                        }
                    }
                    break;
                }
            }
            if (found) System.out.println(new String(chars));
            else System.out.println("no answer");
        }
    }
    static String toTime(int h, int m) {

        String prefix = "";
        String suffix = "";
        String min = "";
        String unit = "";
        if (m > 30) {
            m = 60 - m;
            h++;
            prefix = " to ";
        }
        if (m == 0) suffix = " o' clock";
        else if (m == 30) min = "half";
        else if (m == 15) min = "quarter";
        else if (m == 1) unit = " minute";
        else unit = " minutes";
        if (prefix.equals("") && suffix.equals("")) prefix = " past ";
        if (min.equals("")) min = toText(m);
        String hour = h == 13 ? "one" : toText(h);

        return min + unit + prefix + hour + suffix;
    }

    static String toText(int n) {
        String hour;
        switch (n) {
            case 1: hour = "one"; break;
            case 2: hour = "two"; break;
            case 3: hour = "three"; break;
            case 4: hour = "four"; break;
            case 5: hour = "five"; break;
            case 6: hour = "six"; break;
            case 7: hour = "seven"; break;
            case 8: hour = "eight"; break;
            case 9: hour = "nine"; break;
            case 10: hour = "ten"; break;
            case 11: hour = "eleven"; break;
            case 12: hour = "twelve"; break;
            case 13: hour = "thirteen"; break;
            case 14: hour = "fourteen"; break;
            case 15: hour = "quarter"; break;
            case 16: hour = "sixteen"; break;
            case 17: hour = "seventeen"; break;
            case 18: hour = "eighteen"; break;
            case 19: hour = "nineteen"; break;
            case 20: hour = "twenty"; break;
            case 21: hour = "twenty one"; break;
            case 22: hour = "twenty two"; break;
            case 23: hour = "twenty three"; break;
            case 24: hour = "twenty four"; break;
            case 25: hour = "twenty five"; break;
            case 26: hour = "twenty six"; break;
            case 27: hour = "twenty seven"; break;
            case 28: hour = "twenty eight"; break;
            case 29: hour = "twenty nine"; break;
            case 30: hour = "half"; break;
            default: hour = "";
        }
        return hour;
    }



    static int max2char(char[] c) {
        int n = c.length;
        // count total occur of char
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[c[i] - 'a']++;
        }
        // loop in char count, combine 2 max occur
        // create new array with  only 2 char
        // check valid string
        int max = 0;
        for (int i = 0; i < 25; i++) {
            if (count[i] == 0) continue;
            for (int j = i + 1; j < 26; j++) {
                if (count[j] == 0) continue;
                char cc = '\0';
                char c1 = (char)('a' + i);
                char c2 = (char)('a' + j);
                boolean valid = true;
                for (int x = 0; x < n; x++) {
                    if (c[x] == c1 || c[x] == c2) {
                        if (c[x] == cc) {
                            valid = false;
                            break;
                        }
                        cc = c[x];
                    }
                }
                if (valid && max < count[i] + count[j]) max = count[i] + count[j];
            }
        }
        return max;
    }
}
