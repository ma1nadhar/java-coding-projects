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

        System.out.println("The sum of the digits in number 124 is " + sumDigits(124));
        System.out.println("The sum of the digits in number 5 is " + sumDigits(5));
        System.out.println("The sum of the digits in number -89 is " + sumDigits(-89));
        System.out.println("The sum of the digits in number 9869 is " + sumDigits(9869));

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
