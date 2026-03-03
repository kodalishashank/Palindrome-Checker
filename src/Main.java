import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 10.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized, 0, normalized.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is palindrome (ignoring spaces and case)");
        } else {
            System.out.println(input + " is not palindrome (ignoring spaces and case)");
        }

        scn.close();
    }

    private static boolean checkPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return checkPalindrome(str, start + 1, end - 1);
    }
}