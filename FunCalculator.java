package day2;
import java.util.Scanner;

public class FunCalculator {

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Method to check if a number is Lucky
    public static boolean isLucky(int number) {
        int sum = 0;
        int position = 2; // starting from the second position
        while (number != 0) {
            int digit = number % 10;
            if (position % 2 == 0) {
                sum += Math.pow(digit, 2);
            }
            number /= 10;
            position++;
        }
        return sum % 9 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (1 for Armstrong, 2 for Lucky): ");
        int choice = scanner.nextInt();

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        switch (choice) {
            case 1:
                if (isArmstrong(number)) {
                    System.out.println(number + " is an Armstrong number.");
                } else {
                    System.out.println(number + " is not an Armstrong number.");
                }
                break;
            case 2:
                if (isLucky(number)) {
                    System.out.println(number + " is a Lucky number.");
                } else {
                    System.out.println(number + " is not a Lucky number.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}