// 1

public class WhileLoopExample {
    public static void main(String[] args) {
        // Print even numbers from 2 to 20
        int number = 2;
        while (number <= 20) {
            System.out.println("Even Number: " + number);
            number += 2;
        }
    }
}

import java.util.Scanner;

//2

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Ask for input until number is greater than 100
        while (number <= 100) {
            System.out.print("Enter a number (greater than 100 to stop): ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        }

        System.out.println("Loop ended. You entered a number greater than 100.");
    }
}
