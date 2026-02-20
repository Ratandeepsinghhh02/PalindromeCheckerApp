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

    }
}