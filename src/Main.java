import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 9.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
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