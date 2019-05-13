package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class Spending {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        System.out.println(spending(console,"John"));
        System.out.println(spending(console,"Jane"));

    }

    public static String spending(Scanner console,String name){

        System.out.print("How much will "+name + " be spending? ");

        double amount = console.nextDouble();

        int numBill = (int) (amount / 20.0) ;

        if (numBill * 20 < amount){

            numBill++;
        }

        return  name + " needs " + numBill + " bills";
    }
}
