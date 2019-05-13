package Practice_IT_Cap3_ParametersAndObjects;

import java.util.Scanner;

public class ProcessName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ProcessName pn = new ProcessName();

        pn.processName(scan);

    }

    public String processName(Scanner scan){

        System.out.print("Please enter your full name: ");

        String fullName = scan.nextLine();

        String [] parts = fullName.split(" ",5);

        String firtsName = parts[0];

        String lastName = parts[1];

        System.out.println("Your name in reverse order is "+ lastName + ", " + firtsName);

        return "";
    }
}
