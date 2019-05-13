package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class Colors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(colors(scan));

    }


    public static String colors(Scanner scan){

        System.out.print("What color do you want? ");
        String color = scan.nextLine();

        if (color.equalsIgnoreCase("R")){

            System.out.println("You have chosen Red.");
        }else if(color.equalsIgnoreCase("G")){

            System.out.println("You have chosen Green.");
        }else if (color.equalsIgnoreCase("B")){

            System.out.println("You have chosen Blue.");
        }else{

            System.out.println("Unknown color: "+color);
        }

        return "";

    }
}
