package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class LongestName {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        longestName(scan,7);
    }


    public static String longestName(Scanner scan, int n) {

        String longest = "";

        boolean tie = false;

        if ( n <= 0){

            System.err.println("n must be greather than 1");
        }

        for (int i = 0 ; i<= n-1;++i){

            System.out.print("name #" + (i+1) + "? " );
            String name = scan.next();

            if (name.length() == longest.length() ){

                tie = true;
            } else if (name.length() > longest.length()){

                tie = false;

                longest = name;

            }

            System.out.println(longest);

        }

        String capitalized = longest.substring(0,1).toUpperCase() + longest.substring(1).toLowerCase();

        System.out.println(capitalized+"'s name is the longest");
        if (tie){

            System.out.println("There was a tie");
        }


        return capitalized;
    }

}
