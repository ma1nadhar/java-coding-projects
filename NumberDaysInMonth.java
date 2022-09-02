/* 
 * NumberDaysInMonth.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program returns a boolean if a given year is a
 * leap year. It also returns the number of days in a month given 
 * the month and year.
 * 
 */

public class NumberDaysInMonth {

	public static void main(String[] args) {
		
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		
		System.out.println();
		
		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(8, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));

	}
	
	// return true/false if given year is a leap year
	public static boolean isLeapYear(int year) {
		
		// not valid year returns false
		if ((year < 1) || (year > 9999)) {
			
			return false;
			
		}
		
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	// returns the days in the month given month and year
	public static int getDaysInMonth(int month, int year) {
		
		if ((month < 1) || (month > 12)) {
			
			return -1;
			
			
		}
		
		if ((year < 1) || (year > 9999)) {
			
			return -1;
			
		}
		
		if (isLeapYear(year) == false) {
			
			switch(month) {
				
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					return 31;
					
				case 2: 
					return 28;
					
				case 4: case 6: case 9: case 11:
					return 30;
					
				default:
					return -1;
			
			}
			
		} else {
			
			switch(month) {
			
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					return 31;
					
				case 2: 
					return 29;
					
				case 4: case 6: case 9: case 11:
					return 30;
					
				default:
					return -1;
		
			} // end switch
			
		} // end else
		
	} // end method

} // end class
