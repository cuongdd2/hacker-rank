package algo.string;

public class SherlockValidString {
  static String isValid(String s){
    int[] counts = new int[26];
    for (char c : s.toCharArray()) {
      counts[c - 97]++;
    }
    int max = 0;
    int old = 0;
    int invalid = 0;
    for (int c : counts) {
      if (c == 0) continue;
      if (max == 0) {
        max = old = c;
      } else if (max != c) {
        if (old == c) {
          continue;
        }
        invalid += Math.abs(max - c);
        if (invalid > 1) return "NO";
        max = c;
      } else {
        old = max;
      }
    }
    return "YES";
  }

  public static void main(String[] args) {
    String s = "abbcdee";
    String result = isValid(s);
    System.out.println(result);
  }
}
