package code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> gmail = new ArrayList<>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if (emailID.matches(".+@gmail\\.com$")) {
                gmail.add(firstName);
            }
        }

        gmail.sort(Comparator.naturalOrder());
        for (String e : gmail) System.out.println(e);
    }
}
