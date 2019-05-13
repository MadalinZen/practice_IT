package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class printPalindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        printPalindrome(scan);
    }

    public static String printPalindrome(Scanner scan) {

        System.out.println("Type one or more words ! ");

        System.out.println("To exit type quit the program !");

        while (true) {

            String name = scan.next();

            boolean flag = true;

            if (name.equals("quit")){

                break;

            }

            for (int i = 0; i <= (name.length() - 1) / 2; ++i) {

                if (name.charAt(0) != name.charAt(name.length() - 1)) {

                    System.out.println(name + "is not a palindrome.");

                    flag = false;

                    break;
                }
            }

            if (flag) {

                System.out.println(name + "is a palindrome.");
            }



        }

        return "";


    }
}
