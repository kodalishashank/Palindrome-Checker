import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 6.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }

        while(!stack.empty()){
           if(queue.poll() != stack.pop()){
               isPalindrome = false;
               break;
           }
        }

        if (isPalindrome){
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }


        scn.close();
    }
}