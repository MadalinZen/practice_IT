package PracticeIT_Cap4_ConditionalExecution;

public class FractionSum {

    public static void main(String[] args) {


        System.out.println(fractionSum(1));
        System.out.println(fractionSum(2));
        System.out.println(fractionSum(15));

    }


    public static double fractionSum(int number){

        float res = 0f ;


        for  (double i  = 2 ; i <= number;++i){


             res +=   1 / i ;
        }

        float resFinal = 0 ;

        resFinal = 1 + res;

        return resFinal;
    }



}
