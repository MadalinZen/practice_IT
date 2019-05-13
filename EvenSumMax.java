package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class EvenSumMax {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        evenSum(scan);

    }


    public static void evenSum(Scanner scan) {

        System.out.print("how many integers? ");

        int number = scan.nextInt();

        int[] arrayElem = new int[number];

        int sumEvenNum = 0 ;

            for (int i = 0; i <= number - 1; ++i) {

                System.out.print("next integer? ");

                int nextNumber = scan.nextInt();
                arrayElem[i] = nextNumber;

                if (arrayElem[i] % 2 == 0 ) {

                    sumEvenNum += arrayElem[i];
                }


            }

            int greatestElem = arrayElem[0];

            for (int i = 0; i < arrayElem.length - 1; ++i) {

               // boolean evenNum = arrayElem[i] % 2 == 0 ;

                if (greatestElem < arrayElem[i] && (arrayElem[i] % 2 == 0)){

                    greatestElem = arrayElem[i];
                }


            }

            System.out.println("even sum = " + sumEvenNum);
            System.out.println("even max = " + greatestElem);

    }
}
