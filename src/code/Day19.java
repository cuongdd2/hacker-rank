package code;

/**
 * Created by cuongdd2@gmail.com on 02-Apr-17.
 */
class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        sum += n;
        return sum;
    }
}

interface AdvancedArithmetic{
    int divisorSum(int n);
}