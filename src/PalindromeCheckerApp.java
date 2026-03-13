//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome to palindrome checker app");

        System.out.println("Version : 1.0");
        Scanner sc=new Scanner(System.in);
        String Text=sc.nextLine();
        boolean isPalindrome=true;
        for(int i=0;i<Text.length()/2;i++) {
            if (Text.charAt(i) != Text.charAt(Text.length() - 1 - i)) {
                isPalindrome = false;
                break;

            }

        }
        if(isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        //iteration from last character to first
        String reversed = "";

        for(int i=Text.length()-1;i>=0;i--){
            reversed += Text.charAt(i);
        }
        if(Text.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        // end of reverse iteration method


        //Character Array Based Palindrome Check
        char[] chars = Text.toCharArray();


        int start = 0;
        int end = chars.length - 1;


        isPalindrome = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


        //uc5 Stack-Based Palindrome Checker

        Stack<Character> stack = new Stack<>();
        for (char c : Text.toCharArray()) {
            stack.push(c);
        }
        isPalindrome=true;

        for (char c : Text.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


        //UC6  Queue + Stack Based Palindrome Check
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> Stack = new Stack<>();
        for (char c : Text.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }
        isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

    }
}