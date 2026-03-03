import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 7.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();

        Deque<Character> deque = new LinkedList<>();
        boolean isPalindrome = true;

        // Insert characters into Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }

        scn.close();
    }
}