/* 
 * ReadUserInput.java
 * 
 * Maina Dhar
 * Java Project
 * 
 * This java program uses the Java Scanner class
 * to take user input and outputs that input.
 * 
 */

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String [] args) {

        // allows to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // handle the "Enter" key issue
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2023 - yearOfBirth;

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        scanner.close();

    }
}
