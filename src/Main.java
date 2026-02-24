import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 4.0");
        System.out.println("================================================");

        System.out.print("Enter string to check Palindrome: ");
        String input = scn.nextLine();
        char[] charArray= input.toCharArray();
        boolean isPalindrome = true;

        int left = 0;
        int right = charArray.length - 1;

        while(left < right){
            if(charArray[left] != charArray[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome){
            System.out.println("\n " + input + " is palindrome");
        } else {
            System.out.println("\n " + input + " is not palindrome");
        }


        scn.close();
    }
}