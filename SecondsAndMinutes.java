/* 
 * SecondsAndMinutes.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program converts the given seconds and minutes into hours. It also
 * must output double digit values. The program uses the Java programming 
 * concept of Method Overloading.
 * 
 */

public class SecondsAndMinutes {

	// constant invalid statement
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value!";
	
	public static void main(String[] args) {
		
		// normal test conditions
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945L));
		System.out.println(getDurationString(267598L));
		
		System.out.println();
		
		// invalid test conditions
		System.out.println(getDurationString(-65, 45));
		System.out.println(getDurationString(-69383L));

	}

	// calculates hours, minutes, and seconds based on
	// the two parameters minutes and seconds
	private static String getDurationString(long minutes, long seconds) {

		// check if parameters are valid
		if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {

			return INVALID_VALUE_MESSAGE;

		}

		// calculate hours from given minutes
		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;

		// convert to String
		String hoursString = Long.toString(hours);
		String minString = Long.toString(remainingMinutes);
		String secString = Long.toString(seconds);

		// if statements to check if double digit
		if (hoursString.length() == 1) {

			hoursString = "0" + hoursString;

		}

		if (minString.length() == 1) {

			minString = "0" + minString;

		}

		if (secString.length() == 1) {

			secString = "0" + secString;

		}

		// return string containing hours, minutes, and seconds
		return hoursString + "h " + minString + "m " + secString + "s";

	}

	// calculates hours, minutes, and seconds based on
	// the two parameters minutes and seconds
	private static String getDurationString(long seconds) {

		// check if parameter is valid
		if (seconds < 0) {

			return INVALID_VALUE_MESSAGE;

		}

		// calculate minutes from given seconds
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;

		// call other overloading method
		return getDurationString(minutes, remainingSeconds);

	}

}
