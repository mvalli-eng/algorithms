package net.learningprogramming.algorithm.euclid;

/**
 * Euclid Algorithm<br>
 * it calculates teh GCD(A,B) - Greatest Common Divisor between given two numbers A and B
 */
public class Euclid {

    /**
     * Implementation using recursion<br>
     * 22/6 = 3 reminder 4
     * 6/4 = 1 reminder 2
     * 4/2 = 2 reminder 0
     * <p>
     * If the remainder is not 0, it recursively calls gcd() with the divisor
     * and the remaining as the new pair of numbers.
     * This is because the GCD of number and divisor is the same as the
     * GCD of divisor and remaining.
     */
    public int gcd(int number, int divisor) {
        int remaining = (number % divisor);
        return remaining != 0 ? gcd(divisor, remaining) : divisor;
    }

    /**
     * Implementation without recursion<br>
     * 22/6 = 3 reminder 4
     * 6/4 = 1 reminder 2
     * 4/2 = 2 reminder 0
     * <p>
     * In a loop
     * A temporary variable temp is created and assigned the current value of divisor.
     * divisor is then updated with the remainder when number is divided by divisor.
     * number is then updated with the previous value of divisor (stored in temp).
     */
    public int gcdNonRecrussion(int number, int divisor) {
        while (divisor != 0) {
            int temp = divisor;
            divisor = number % divisor;
            number = temp;
        }
        return number;
    }
}
