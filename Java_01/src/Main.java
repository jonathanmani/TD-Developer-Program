import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*-----------------------------------------------------------
        01. Write a "Hello World!" program in Java and execute it
         -----------------------------------------------------------*/
        System.out.println("Hello World");

        /*-----------------------------------------------------------
        02. Write a program that takes in a user input(Integer), checks
        whether that Integer is positive or negative or neither, and then
        return the output
         -----------------------------------------------------------*/
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");

        int userNumber = userInput.nextInt();

        if(userNumber == 0){
            System.out.println(userNumber + " is neither negative nor positive");
        } else if (userNumber % 2 == 1){
            System.out.println(userNumber + " is negative");
        } else {
            System.out.println(userNumber + " is positive");
        }

        /*-----------------------------------------------------------
        03. Write a program that takes in a user input(character),
        then finds and prints the ACII value of that character
         -----------------------------------------------------------*/
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("");
        System.out.println("Type in a character");

        char userLetter = sc.next().charAt(0);
        int ascii = (int)userLetter;
        System.out.println("The ASCII Value of " + userLetter + " is " + ascii);

        /*-----------------------------------------------------------
        04. Write a program to display the "Fibonacci Series" of first
         n numbers(entered by the user)
         ---------------------------------------------------------®--*/
        Scanner fib = new Scanner(System.in);
        System.out.println("Enter a number of terms: ");

        int userFib = fib.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;

        for(int i = 1; i <=userFib; ++i){
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
