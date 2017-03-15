package mum;

public class A2 {
    public static void main(String[] args) {
        isStepped(new int[]{1, 1, 1, 5, 5, 5, 5, 8, 8, 8});
        isStepped(new int[]{1, 1, 5, 5, 5, 5, 8, 8, 8});
        isStepped(new int[]{5, 5, 5, 15});
        isStepped(new int[]{3, 3, 3, 2, 2, 2, 5, 5, 5});
        isStepped(new int[]{3, 3, 3, 2, 2, 2, 1, 1, 1});
        isStepped(new int[]{1, 1, 1});
        isStepped(new int[]{1, 1, 1, 1, 1, 1, 1});
    }

    static int isStepped(int[ ] a) {
        int minOccur = 3;
        if (a == null || a.length < minOccur) return 0;

        int count = 1;
        int current = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] == current) {
                ++count;
            } else {
                if (count < minOccur) return 0;
                else {
                    if (current > a[i]) return 0;
                    else current = a[i];
                }
                count = 1;
            }
        }

        return count >= minOccur ? 1 : 0;
    }
}
