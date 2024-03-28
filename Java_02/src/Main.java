import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*------------------------------------------------------------------
        01. Write a program to check whether the user input is a String or
        Number and then perform the Palindrome operation on it. Return a
        statement mentioning whether the input is a Palindrome or not
        ------------------------------------------------------------------- */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a String or a Number");
        String userInput = scanner.nextLine();

        if(isNumeric(userInput)){
          userInput = String.valueOf(userInput);
        }

        int left = 0;
        int right = userInput.length() - 1;
        boolean isPalindrome = true;

        while(left < right){
            if(userInput.charAt(left) != userInput.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }

        /*------------------------------------------------------------------
        02. Write a program to check whether it's a leap year or not
        ------------------------------------------------------------------- */
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type a year");
        int leapyear = scanner2.nextInt();
        boolean isLeapYear;

        isLeapYear = leapyear % 4 == 0;

        isLeapYear = isLeapYear && (leapyear % 100 !=0 || leapyear % 400 == 0);

        if(isLeapYear){
            System.out.println("This is a leapyear");
        } else{
            System.out.println("This is not a leapyear");
        }

         /*------------------------------------------------------------------
        03. Write a program that takes in a user input (String) and performs
        the following operation on
            a) Get the string length and print it
            b) Reverse a string and print it
        ------------------------------------------------------------------- */

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Write a string");
        String userInput2 = scanner3.nextLine();

        int strLength = userInput2.length();
        String reverseStr = "";
        char ch;

        for(int i = 0; i<strLength; i++){
            ch = userInput2.charAt(i);
            reverseStr = ch + reverseStr;
        }

        System.out.printf("This string is %d characters long. When reversed, it prints out as %s", strLength, reverseStr);

        /*-------------------------------------------------------------------
        04. Write a program that takes 2 strings as inputs and performs the
        following operations:
            a) Join 2 strings and prints it
            b) Compare 2 strings and prints the result using the following methods
                i) equals() method
                ii) "==" operator
                iii) compareTo() method
        ------------------------------------------------------------------- */
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Write 2 strings (Click enter after each string): ");
        String userStr = scanner4.nextLine();
        String userStr2 = scanner4.nextLine();

        System.out.printf("Your 2 strings were %s and %s", userStr, userStr2);
        System.out.println("Output of equals() method: " + userStr.equals(userStr2));
        System.out.println("Output of the == operator: " + (userStr == userStr2 ? true: false));
        System.out.println("Output of the compareTo() method: " + userStr.compareTo(userStr2));

    }
    private static boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}