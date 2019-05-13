package Practice_IT_Cap3_ParametersAndObjects;

public class PowersOfN {

    public static void main(String[] args) {

        printPowersOfN(4,3);
//        printPowersOfN(5,6);
//        printPowersOfN(-2,8);


    }


    public static void printPowersOfN(int base,int exponent){

        for (int i = 0 ; i <=exponent;++i){

            double res = base^i;

          //  double res = Math.pow(base,i);

            System.out.print((int)res+" ");
        }
        System.out.println();
    }
}
