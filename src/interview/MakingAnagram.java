package interview;

import java.util.Scanner;

/**
 * Created by cuongdd on 10-Mar-17.
 */
public class MakingAnagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(deletedChars(a, b));
        System.out.println(deletedChars("alksdsjflakjdsfljasdlhjkhalkfjhadskjfhasdljkhfkljhadskjfhadskljhflksadhfkjadsh", "fajdslkfjhlkfjahdslkfjkalsdkfasdkhlfjadskfhsdakjfhaskddjh"));
    }

    static int deletedChars(String a, String b) {
        // convert string to char's array
        // count char from a - z occur in each string
        // for a - z, sum the diff between number occur of each char
        // return sum as deletion needed chars
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        int[] ca = new int[26];
        int[] cb = new int[26];
        for (int i = aa.length - 1; i >= 0; --i) {
            ca[aa[i] - 'a']++;
        }
        for (int i = bb.length - 1; i >= 0; --i) {
            cb[bb[i] - 'a']++;
        }
        int sum = 0;
        for (int i = 0; i < 26; ++i) sum += Math.abs(ca[i] - cb[i]);
        return sum;
    }


}
