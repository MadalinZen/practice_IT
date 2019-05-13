package Practice_IT_Cap3_ParametersAndObjects;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert low limit : ");

         int low = scan.nextInt();

        System.out.println("Insert high limit : ");

        int high = scan.nextInt();

        int sum = 0 ;

        for (int i =  low; i <= high;i++){

            sum +=i;
        }

        System.out.println("sum is : " + sum);
    }
}
