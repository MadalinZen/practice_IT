package Practice_IT_Cap3_ParametersAndObjects;

import java.util.Scanner;

public class InputBirthday {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        InputBirthday ib = new InputBirthday();

        ib.inputBirthday(scan);

    }

    public  void inputBirthday(Scanner scan){

        System.out.println("On what day of the month were you born? ");

        int day = scan.nextInt();

        System.out.println("What is the name of the month in which you were born? ");

        String month = scan.next();

        System.out.println("During what year were you born? ");

        int year = scan.nextInt();

        System.out.println("You were born on "+month +" " + day +", "+ year +". "+ " You're mighty old");


    }
}
