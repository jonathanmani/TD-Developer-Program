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