package code;

import java.util.Scanner;

/**
 * Created by cuongdd on 14-Mar-17.
 */
public class Day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1 || (n >= 6 && n <= 20)){
            ans = "Weird";
        }
        else{
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
