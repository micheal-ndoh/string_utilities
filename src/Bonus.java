
import Algorithms.Functions;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to my bonus console app\n");

        while (true) {
            System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
            System.out.println("\nSelect an option of what you want to do\n");
            System.out.println("1. Check if a sentence is a Palindrome (sentence having the same meaning when read in the opposite direction).");
            System.out.println("2. Check if a Password is Strong.");
            System.out.println("3. Reverse a String(s).");
            System.out.println("4. Compress a String.");
            System.out.println("5. Remove all vowels from a sentence.");
            System.out.println("6. Exit");
            System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("\n> Enter a sentence to check if it's a palindrome:");
                    System.out.println("Output: " + Functions.isPalindrome(scanner.nextLine()));
                    break;

                case "2":
                    System.out.println("\n> Enter a password to check if it's strong:");
                    System.out.println("Output: " + Functions.isStrongPassword(scanner.nextLine()));
                    break;

                case "3":
                    System.out.println("\n> Enter a string to reverse:");
                    System.out.println("Output: " + Functions.reverseWords(scanner.nextLine()));
                    break;

                case "4":
                    System.out.println("\n> Enter a string to compress:");
                    System.out.println("Output: " + Functions.stringCompressor(scanner.nextLine()));
                    break;

                case "5":
                    System.out.println("\n> Enter a sentence to remove all vowels:");
                    System.out.println("Output: " + Functions.removeVowels(scanner.nextLine()));
                    break;

                case "6":
                    System.out.println("\nExiting....\n bye bye ");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("\n> Invalid option. Please try again.\n");
            }
        }
    }
}
