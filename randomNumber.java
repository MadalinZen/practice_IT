package Practice_IT_Cap5_LogicAndIndefiniteLoops;

import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        int number =( random.nextInt(49)*1)+51;

        // Add 1 to the result to get a number from the required range
// (i.e., [1 - 50]).
        //n += 1;

        System.out.println("number: " +number);

        int randomNumber =(int) (Math.random() * 100 + 1 ) ;

        System.out.println("randomNumber = " +randomNumber);

//        Why?
//
//                random() method returns a random number between 0.0 and 0.9..., you multiply it by 50, so upper limit
//        becomes 0.0 to 49.999... when you add 1, it becomes 1.0 to 50.999..., now
//        when you truncate to int, you get 1 to 50. (thanks to @rup in comments).
//        leepoint's awesome write-up on both the approaches.
    }




}
