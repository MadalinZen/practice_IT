package Practice_IT_Cap5_LogicAndIndefiniteLoops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sentinelMinMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nextNumber = 0 ;

        ArrayList<Integer> listElem = new ArrayList<>();

        do {

            System.out.print("Type a number (or -1 to stop): ");

            nextNumber = scan.nextInt();

            listElem.add(nextNumber);

        }while(nextNumber != -1);

        //MAX NUMBER
        Collections.sort(listElem);
        Collections.reverse(listElem);
        System.out.println("Maximum was "+listElem.get(0));

        //MIN NUMBER
        Collections.sort(listElem);
        System.out.println("Minimum was "+listElem.get(0));





    }

}
