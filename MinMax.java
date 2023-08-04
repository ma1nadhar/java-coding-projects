/* 
 * MinMax.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program uses the Java Scanner class
 * to take user input and outputs the min and max values. 
 * Contains if/else, while, and boolean statements.
 * 
 */

import java.util.Scanner;

public class MinMax {

    public static void main(String [] args) {

        // allows to read user input
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int counter = 1;
        boolean setInitial = false;

        while(true) {

            System.out.println("Enter number " + counter + ": ");
            counter++;

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int intVal = scanner.nextInt();

                if (setInitial == false) {
                    min = intVal;
                    max = intVal;
                    setInitial = true;
                }

                if (intVal > max) {
                    max = intVal;
                } else if (intVal < min) {
                    min = intVal;
                }

            } else {
                System.out.println("Complete");
                break;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);

        scanner.nextLine();
        scanner.close();

    }


}