import org.xml.sax.SAXNotRecognizedException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         /*------------------------------------------------------------------
        01. Write a program that creates an array, iterates and prints out
        the elements within that array
        ------------------------------------------------------------------- */
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        for(int i=1; i<nums.length +1; i++){
            System.out.println(i);
        }

        /*------------------------------------------------------------------
        02. Write a program that displays even numbers from 1 to 100
        ------------------------------------------------------------------- */
        for(int j = 0; j<=100; j = j+2){
            System.out.println(j);
        }

        /*------------------------------------------------------------------
        03. Write a function that takes the length and width of a rectangle
        as perameters and calculates the area of the rectangle. Display the
        result on the console
        ------------------------------------------------------------------- */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the length and width (Separate each value by clicking enter)");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        System.out.println("The area of the rectangle is: " + length*width);
    }
}