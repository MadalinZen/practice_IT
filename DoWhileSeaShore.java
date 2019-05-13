package Practice_IT_Cap5_LogicAndIndefiniteLoops;

import java.util.Scanner;

public class DoWhileSeaShore {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer;

        do {
            System.out.println("She sells sheashells by the seashore.");

            System.out.print("Do you want to hear it again? ");

             answer = scan.next();
        }while(!answer.equalsIgnoreCase("n"));
    }
}
