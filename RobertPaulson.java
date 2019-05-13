package Practice_IT_Cap3_ParametersAndObjects;

import java.util.Scanner;

public class RobertPaulson {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your phrase? ");

        String phrase = scan.nextLine();

        System.out.println(phrase);

        System.out.println("How many times should I repeat it?");

        int repeatIt = scan.nextInt();

        System.out.println(repeatIt);

        for (int i = 0 ; i <=repeatIt;i++){

            System.out.println(phrase);
        }
    }
}
