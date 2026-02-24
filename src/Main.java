import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 4.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();
        String reversed_input = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while(!stack.empty()){
            reversed_input += stack.pop();
        }

        if (input.equals(reversed_input)){
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }


        scn.close();
    }
}