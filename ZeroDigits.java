package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class ZeroDigits {

    public static void main(String[] args) {

        System.out.println(zeroDigits(743));
        System.out.println(zeroDigits(5024036));
        System.out.println(zeroDigits(0));

    }

    public static int zeroDigits(int number){

        int rest = 0 ;
        int count = 0;

        if (number == 0 ){

            return  1 ;
        }

        do {



            if (number == 0){

                break;
            }

            System.out.println("number is :" + number);
            if (number % 10 == 0) {

                count++;

            }

            number /= 10 ;





        }while(number!=0);

        return count;
    }
}
