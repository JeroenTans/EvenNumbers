package Programming.Basic;

import java.util.Scanner;

public class Main {
    /* Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method. */

    public static void main(String[] args) {
       int numberOne;
       Scanner input = new Scanner(System.in);

       for (;;) {
           System.out.println("Geef een getal op: ");
           numberOne = input.nextInt();

           if (isEven(numberOne)) {
               System.out.println("Dit is een even nummer ");
           } else {
               System.out.println("Dit is geen even nummer");
           }
       }


    }

    public static boolean isEven (int exampleNumber) {
            if (exampleNumber % 2 == 0) {
                return true;
            } else return false;
        }



}