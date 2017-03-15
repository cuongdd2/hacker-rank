package w30;

import java.util.Scanner;

/**
 * Created by cuongdd on 16-Mar-17.
 */
public class MelodiousPass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }

    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    static char[] consonants = new char[26 - vowels.length - 1];
    static boolean isVowel(char c) {
        for (char vowel : vowels) {
            if (vowel == c) return true;
        }
        return false;
    }

    static void print(int n) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            if ('y' == c) continue;

            if (!isVowel(c)) consonants[count++] = c;
        }
        pass("", n);
    }

    static void pass(String s, int n) {
        if (n > 0) {
            char prev = s.length() > 0 ? s.toCharArray()[s.length() - 1] : '\0';
            for (int k = 0; k < 26; k++) {
                char c = (char)('a' + k);
                if (c == 'y') continue;
                if (prev == '\0' || (isVowel(prev) && !isVowel(c)) || (!isVowel(prev) && isVowel(c))) {
                    pass(s + c, n - 1);
                }
            }
        } else System.out.println(s);
    }

}
