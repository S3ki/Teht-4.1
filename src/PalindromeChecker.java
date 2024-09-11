import java.util.Scanner;

public class PalindromeChecker {
    public static String inputChanger(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("[^a-z]", ""); // Poistaa kaikki ei-aakkoset merkit
        return input;
    }

    public static boolean palindromCheck(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert your input here: ");
        String input = scanner.nextLine();

        String transformed = inputChanger(input);

        // Checks the validity of the input / palindrome or not
        boolean isPalindrome = palindromCheck(transformed);
        if (isPalindrome) {
            System.out.println("Is a palindrome.");
        } else {
            System.out.println("Is not a palindrome.");
        }
    }
}