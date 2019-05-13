package Practice_IT_Cap3_ParametersAndObjects;

import java.util.Scanner;

public class ReadFromKeyboard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a number : ");

        int valueFromUser = scan.nextInt();

        int valueFromUserMultiplied = valueFromUser * 2; ;

        System.out.println(valueFromUser + " times 2 = " + valueFromUserMultiplied);
    }
}
