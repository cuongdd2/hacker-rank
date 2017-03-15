package algo;

/**
 * Created by cuongdd2@gmail.com on 13-Mar-17.
 */
public class StarCase {
    public static void main(String[] args) {
        StairCase(10);
    }

    static void StairCase(int n) {
        String spaces;
        String stars;
        for (int i = 0; i < n; i++) {
            spaces = "";
            for (int j = 0; j < n - i; j++) {
                spaces += " ";
            }
            System.out.print(spaces);
            stars = "";
            for (int j = 0; j < i; j++) {
                stars += "#";
            }
            System.out.print(stars);
            System.out.println("");
        }
    }

    static int summation(int[] numbers) {
        int sum = 0;
        for (int i = numbers.length - 1; i >= 0; i--) sum += numbers[i];
        return sum;
    }
}
