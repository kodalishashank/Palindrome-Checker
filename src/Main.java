public class Main{
    public static void main (String[] args){

        System.out.println("================================================");
        System.out.println("Welcome to the Palindrome Checker App");
        System.out.println("Version: 1.1git");
        System.out.println("================================================");

        String original = "madam";
        String reverse = "";
        for(int i = original.length() -1; i >=0; i--) reverse += original.charAt(i);

        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}