/* 
 * ConvertFeetInchesToCentimeters.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program converts Feet and Inches into Centimeters. The program
 * uses the Java programming concept of Method Overloading.
 * 
 */

public class ConvertFeetInchesToCentimeters {

	// main method
	public static void main(String[] args) {
		
		// normal test conditions
		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(7, 5);
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);
		
		System.out.println();
		
		// invalid test conditions
		calcFeetAndInchesToCentimeters(-10, 1);
		calcFeetAndInchesToCentimeters(6, -10);
		calcFeetAndInchesToCentimeters(-10);

	}
	
	// returns the centimeter value which is double data type 
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		// check if value of feet and inches are valid
		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			
			System.out.println("Invalid feet or inches parameters!");
			return -1;
			
		}
		
		// convert feet and inches to centimenters
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		
		// print out centimeters
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		
		return centimeters;
		
	}
	
	// returns the centimeter value which is double data type 
	public static double calcFeetAndInchesToCentimeters(int inches) {
		
		// check if value of inches is valid
		if ((inches < 0) || (inches > 12)) {
			
			System.out.println("Invalid inches parameter!");
			return -1;
			
		}
		
		// convert inches into feet
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		
		// print out feet and inches remaining
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
		
		// call first method to calculate centimeters
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
	}

}
