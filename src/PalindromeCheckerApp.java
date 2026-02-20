//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
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
    }
}