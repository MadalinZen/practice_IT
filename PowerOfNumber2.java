package PracticeIT_Cap4_ConditionalExecution;

public class PowerOfNumber2 {

    public static void main(String[] args) {

//        System.out.println(pow2(2.0,-2));
//        System.out.println(pow2(3.0,4));
        System.out.println(pow2(3.5,3));

    }

    public static double pow2(double base,int exponent){

        double res = 1 ;

        if (exponent < 0 ) {

            for (int i = 0; i <= Math.abs(exponent) - 1; ++i) {

                res *= base;
            }

            return 1.0 / res;
        }else {

            for (int i = 0; i <= exponent - 1; ++i) {

                res *= base;
            }

            return res;
        }
    }
}
