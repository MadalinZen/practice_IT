package Practice_IT_Cap5_LogicAndIndefiniteLoops;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class robustInput {

    public static void main(String[] args) throws InputMismatchException {


        Scanner scan = new Scanner(System.in);

        String exitCmd = "";

        do {

            try {

                System.out.print("Type your age : ");

                int age = scan.nextInt();

                System.out.print("Type your GPA: ");

                double gpa = scan.nextDouble();

                System.out.println("age = " + age + ", GPA = " + gpa);

                System.out.print("To continue press Y ,to exit write exit ");

                exitCmd = scan.next();

                if (exitCmd.equalsIgnoreCase("y")) {

                    continue;
                }

        }catch (InputMismatchException in){

            System.out.println("Not a valid format !!! ");

            in.printStackTrace();
        }

        }while (!exitCmd.equalsIgnoreCase("exit"));



        scan.close();


    }
}
