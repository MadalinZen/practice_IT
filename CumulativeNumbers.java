package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class CumulativeNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers? ");

        int nrOfNumbers = scan.nextInt();

        int product = 1 ;

        for (int i = 0 ; i <nrOfNumbers;++i){

            System.out.print("Next number --> ");

            int nextNumber = scan.nextInt();


            product *= nextNumber;
        }

        System.out.println("Product = " + product);
    }





}
