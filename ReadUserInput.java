/* 
 * ReadUserInput.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program uses the Java Scanner class
 * to take user input and outputs that input. Contains if/else
 * statements for error handling.
 * 
 */

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String [] args) {

        // allows to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            // handle the "Enter" key issue
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2023 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();

    }
}
