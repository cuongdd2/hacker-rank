package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by cuongdd2@gmail.com on 27-Mar-17.
 */
public class Day8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> m = new HashMap<>(n);
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            m.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (m.containsKey(s)) {
                System.out.printf("%s=%d%n", s, m.get(s));
            } else System.out.println("Not found");
        }
        in.close();
    }
}
