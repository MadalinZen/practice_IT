package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class PrintGpa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        printGPA(scan);
    }


    public static void printGPA(Scanner scan) {

        System.out.print("Enter a student record : "+" ");

        String name = scan.next();

        int number = scan.nextInt();

        double sumOfElem = 0 ;

        int[] arrayElem = new int[number];

        for (int i = 0; i <= number - 1; ++i) {

            sumOfElem +=scan.nextInt();




        }

        System.out.println(name+"'s grade is "+ sumOfElem / number);
    }
}
