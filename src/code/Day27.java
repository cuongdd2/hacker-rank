package code;

public class Day27 {
    public static void main(String[] args) {
        int t = 5;
        System.out.println("" + t);
        for (int i = 0; i < t; i++) {
            int n = (int) (Math.random() * 194) + 6;
            int k = (int) (Math.random() * (n - 4)) + 2;
            int cp = 0, cn = 0;
            boolean pos = false;
            boolean neg = false;
            boolean zero = false;
            System.out.println(n + " " + k);
            String a = "";
            for (int j = 0; j < n; j++) {
                int r = (int) (Math.random() * 20) - 10;
                if (!zero) r = 0;
                else if (!pos && r < 0) r = -r;
                else if (!neg && r > 0) r = -r;
                if (i % 2 == 0) {
                    if (r > 0 && k > 0) r = -r;
                    k--;
                } else {
                    if (r <= 0 && k <= 1) r = -r;
                    k--;
                }

                if (r > 0) {
                    pos = true;
                    cp++;
                } else if (r < 0) {
                    neg = true;
                    cn++;
                } else zero = true;

                a += r + (j < n - 1 ? " " : "");
            }
            System.out.println(a);
//            System.out.println(cp + " " + cn);
        }
    }
}
