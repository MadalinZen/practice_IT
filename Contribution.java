package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class Contribution {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Is your money multiplied 1 or 2 times? ");

        int times = console.nextInt();

        int donation = 0 ;

        int sum = 0 ;

        int total = 0 ;
        int count1=0;
        int count2 = 0 ;

        if (times ==1){

            System.out.println("And how much are you contributing? ");
             donation = console.nextInt();
            count1++;
        }

        if (times ==2){

            System.out.println("And how much are you contributing? ");
            donation = console.nextInt();
            sum = sum + 2 * donation;
            count2++;
            total = total + donation;
        }

            sum = sum + donation;
            total = total + donation;

        System.out.println(sum);
        System.out.println(total);
    }
}
