package mum;

/**
 * Created by cuongdd2@gmail.com on 03-Apr-17.
 */
public class InterView {
    public static void main(String[] args) {
        parse36();
    }

    static void parse36() {
        String s = "2ire6,2hnou,2hnou,1glia,1qdfw,1qa8l,2b6we,2cxyg,17udi,2c669,2hc6o,2gjy3,2hnou,1wtqj,2hw6p,2hnou,3rzn,tdyd,2h7sb,2i4dw,2gll9,b7lk,b0rj,2a8om,11n,2i2ws,2gjy3,2tyw,2ift2,koha,297yk,2hjq2,2glbp,1xtpa,2fr1e,2dtym,2h1m2";
        String[] arr = s.split(",");
        for (String b : arr) {
            System.out.println(Integer.parseInt(b, 36));
        }
    }


}
