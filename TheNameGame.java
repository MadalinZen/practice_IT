package Practice_IT_Cap3_ParametersAndObjects;

import java.util.Scanner;

public class TheNameGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TheNameGame tng = new TheNameGame();

        tng.theNameGame(scan);

    }

    public String theNameGame(Scanner scan){

        System.out.print("What is your name? Fifty Cent");

       // String name = scan.next();

        System.out.println();

        System.out.println("Fifty Fifty, bo-Bifty\n" +
                "Banana-fana fo-Fifty\n" +
                "Fee-fi-mo-Mifty\n" +
                "FIFTY!\n" +
                "Cent Cent, bo-Bent\n" +
                "Banana-fana fo-Fent\n" +
                "Fee-fi-mo-Ment\n" +
                "CENT! ");

        return "";
    }


}
