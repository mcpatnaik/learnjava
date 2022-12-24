/**
 * @author manik
 */
import java.util.Scanner;
public class Palindrome {
    static void checkPalindrome(String input) {
//Assuming result to be true
        boolean res = true;
        int length = input.length();
//dividing the length of the string by 2 and comparing it.
//not optimum, store length/2 in a variable before comparing.
        for (int i = 0; i <= length / 2; i++) { 
//checking one character from left and one from right
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                res = false;  //one inequality -> not palindrome
                break;
            }
        }
        System.out.println(input + " is palindrome = " + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        checkPalindrome(str); //function call
    }
}
