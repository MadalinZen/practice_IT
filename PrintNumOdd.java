package PracticeIT_Cap4_ConditionalExecution;

public class PrintNumOdd {

    public static void main(String[] args) {

        //printNumOdd(3,8,13);
        printNumOdd(12,8,-9);
    }

    public static boolean isOdd(int number){

        if ( Math.abs(number) % 2 == 1 ){

            return true ;

        }

        return  false;
    }

    public static void printNumOdd(int n1,int n2,int n3){

        int  count = 0 ;

        if (isOdd(n1)){

            count++;
        }if (isOdd(n2)){

            count++;
        }
        if (isOdd(n3)){

            count++;
        }

        System.out.println(count + " of the 3 numbers are odd.");
    //return count + " of the 3 numbers are odd. ";

    }
}
