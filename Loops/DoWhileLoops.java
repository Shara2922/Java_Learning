

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Keep asking until user types "exit"
        do {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Exited loop.");

        scanner.close();
    }
}
