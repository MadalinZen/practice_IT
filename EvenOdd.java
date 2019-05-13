package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type a number: ");

        int a = scan.nextInt();

        if (a % 2 == 0 ){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
