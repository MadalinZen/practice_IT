package PracticeIT_Cap4_ConditionalExecution;

public class PowerOfNumber {

    public static void main(String[] args) {

        System.out.println(pow(3,4));
        System.out.println(pow(2,10));
        System.out.println(pow(11,11));


    }

    public static int pow(int base,int exponent){

        int res = 1 ;

        for (int i = 0; i <=exponent-1;++i){

            res *= base ;
        }

        return res;
    }
}
