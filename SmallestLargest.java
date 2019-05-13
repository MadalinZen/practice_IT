package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        smallestLargest(scan);
    }


    public static int[] smallestLargest(Scanner scan) {

        System.out.print("How many numbers do you want to enter? ");

        int number = scan.nextInt();

        int[] arrayElem = new int[number];

        if (number >= 0) {

            for (int i = 0; i <= number - 1; ++i) {

                System.out.print("Number " + (i + 1) + ": ");

                int nextNumber = scan.nextInt();
                arrayElem[i] = nextNumber;
            }

            int smallestElem = arrayElem[0];

            int greatestElem = arrayElem[0];

            for (int i = 0; i < arrayElem.length - 1; ++i) {

                      if (smallestElem > arrayElem[i]){

                      smallestElem = arrayElem[i];

                      }

                      if (greatestElem < arrayElem[i]){

                          greatestElem = arrayElem[i];
                      }


            }

            System.out.println("smallestElem : " + smallestElem);
            System.out.println("greatestElem : " + greatestElem);
            }
            return arrayElem;

        }
    }
