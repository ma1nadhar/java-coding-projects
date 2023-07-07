import java.util.Scanner;

public class ReadUserInput {
    public static void main(String [] args) {

        // allows to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        scanner.close();

    }
}
