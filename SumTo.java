package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class SumTo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(sumTo(5));
    }

    public static  int sumTo(int n){

        int sum = 0 ;

        for (int i = 0 ; i <=n;++i){


            sum += i;
        }

        return sum;
    }
}
