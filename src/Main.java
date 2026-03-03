import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 13.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        long startRecursive = System.nanoTime();
        boolean recursiveResult = recursiveCheck(normalized, 0, normalized.length() - 1);
        long endRecursive = System.nanoTime();

        long startStack = System.nanoTime();
        boolean stackResult = stackCheck(normalized);
        long endStack = System.nanoTime();

        long startDeque = System.nanoTime();
        boolean dequeResult = dequeCheck(normalized);
        long endDeque = System.nanoTime();

        System.out.println("------------------------------------------------");
        System.out.println("Recursive Result: " + recursiveResult);
        System.out.println("Recursive Time (ns): " + (endRecursive - startRecursive));

        System.out.println("Stack Result: " + stackResult);
        System.out.println("Stack Time (ns): " + (endStack - startStack));

        System.out.println("Deque Result: " + dequeResult);
        System.out.println("Deque Time (ns): " + (endDeque - startDeque));
        System.out.println("------------------------------------------------");

        scn.close();
    }

    private static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursiveCheck(str, start + 1, end - 1);
    }

    private static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop())
                return false;
        }

        return true;
    }

    private static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }

        return true;
    }
}