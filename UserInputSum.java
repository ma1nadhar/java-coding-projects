/* 
 * UserInputSum.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program uses the Java Scanner class
 * to take user input and outputs that sum of the input. 
 * Contains if/else and while statements for error handling.
 * 
 */

import java.util.Scanner;

public class UserInputSum {

    public static void main(String [] args) {

        // allows to read user input
        Scanner scanner = new Scanner(System.in);
        int sumVal = 0;
        int counter = 1;
        while(true) {

            System.out.println("Enter number " + counter + ": ");
            counter++;

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                
                int intVal = scanner.nextInt();
                sumVal += intVal;

                if(counter > 10) {
                    System.out.println(sumVal);
                    break;
                }

            } else {
                System.out.println("Invalid Number");
                break;
            }
        }

        scanner.nextLine();
        scanner.close();

    }


}