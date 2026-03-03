import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 11.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean isPalindrome = checker.checkPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }

        scn.close();
    }
}