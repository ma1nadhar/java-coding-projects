/* 
 * Sums.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program contains methods which uses for loops. The first method
 * will sum numbers divisible by 3 and 5 and the other will sum numbers that 
 * are odd. 
 * 
 */

public class Sums {

	// main method
	public static void main(String[] args) {
		
		sum3And5();
		
		System.out.println();
		
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));

	}

	// sums numbers divisible by 3 and 5 only
	public static void sum3And5() {

		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {

				sum += i;
				count++;
				System.out.println("Conditions met: " + i);

			}

			if (count == 5) {
				break;
			}

		}

		System.out.println("\nSum of numbers: " + sum);

	}
	
	// returns true or false if number is odd
	public static boolean isOdd(int number) {
		
		if ((number % 2 != 0) && (number > 0)) {
			
			return true;
			
		}

		return false;
	}
	
	// sums numbers that are odd
	public static int sumOdd(int start, int end) {
		
		if ((start < 0) || (end < 0)) {
			
			return -1;
			
		}
		
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			
			if (isOdd(i) == true) {
				
				sum += i;
				
			}
			
		}
		
		return sum;

		
	}

}
