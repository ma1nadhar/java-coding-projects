/* 
 * DigitSum.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program returns an int value that is
 * the sum of all numbers in the digit provided.
 * 
 */

public class DigitSum {
    public static void main(String[] args) {

        System.out.println(sumDigits(124));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(9869));


	}

    public static int sumDigits(int number) {

        if (number < 10) {

            return -1;

        }

        int sum = 0;

        while (number >= 1) {
            int leastSignficant = number % 10;
            sum += leastSignficant;
            number = number / 10;
        }

        return sum;
    }
    
}
