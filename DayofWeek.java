
public class DayofWeek {

	public static void main(String[] args) {

		// switch statement
		printDayOfTheWeek(0);
		printDayOfTheWeek(3);
		printDayOfTheWeek(5);
		printDayOfTheWeek(12);
		
		System.out.println();
		
		// if/else statement
		printDayOfTheWeekIfElse(0);
		printDayOfTheWeekIfElse(3);
		printDayOfTheWeekIfElse(5);
		printDayOfTheWeekIfElse(12);
		
	}

	// using switch statement
	private static void printDayOfTheWeek(int day) {

		switch (day) {

			case 0:
				System.out.println("Sunday");
				break;
	
			case 1:
				System.out.println("Monday");
				break;
	
			case 2:
				System.out.println("Tuesday");
				break;
	
			case 3:
				System.out.println("Wednesday");
				break;
	
			case 4:
				System.out.println("Thurday");
				break;
	
			case 5:
				System.out.println("Friday");
				break;
	
			case 6:
				System.out.println("Saturday");
				break;
	
			default:
				System.out.println("Invalid Day");
				break;

		}

	}

	// using if/else statement
	private static void printDayOfTheWeekIfElse(int day) {

		if(day == 0) {	
			System.out.println("Sunday");
			
		} else if (day == 1) {
			System.out.println("Monday");
			
		} else if (day == 2) {
			System.out.println("Tuesday");
			
		}else if (day == 3) {
			System.out.println("Wednesday");
			
		}else if (day == 4) {
			System.out.println("Thursday");
			
		}else if (day == 5) {
			System.out.println("Friday");
			
		}else if (day == 6) {
			System.out.println("Saturday");
			
		} else {
			System.out.println("Invalid Day");
			
		}

	}

}
