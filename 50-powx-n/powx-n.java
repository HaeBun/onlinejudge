class Solution {
    public double myPow(double x, int n) {
        long longN = n;
        if (n == 0)
            return 1;
        else if (n < 0) {
            return powCalculator(1.0 / x, -longN, 1.0); // long 타입으로 넘겨줌, 1 나누기 제곱
        } else
            return powCalculator(x, longN, 1.0);
    }

    public double powCalculator(double base, long index, double result) {
        if (index == 0)
            return result;
        else if (index % 2 == 1)
            return powCalculator(base * base, index / 2, result * base);
        else
            return powCalculator(base * base, index / 2, result);
    }
}