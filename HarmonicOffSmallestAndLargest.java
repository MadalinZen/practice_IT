package PracticeIT_Cap4_ConditionalExecution;

public class HarmonicOffSmallestAndLargest {

    public static void main(String[] args) {

        int [] arrayOfElements = {2,5,9,7,6,8};

        float smallestElem =arrayOfElements[0];

        float greatestElem = arrayOfElements[0];

        float harmonic = 0 ;

        float tmp = 0 ;


        for (int i = 0; i < arrayOfElements.length - 1; ++i) {

            if (smallestElem > arrayOfElements[i]){

                smallestElem = arrayOfElements[i];

            }

            if (greatestElem < arrayOfElements[i]){

                greatestElem = arrayOfElements[i];
            }


        }

        System.out.println("smallestElem : " + smallestElem);
        System.out.println("greatestElem : " + greatestElem);


        try {

            tmp = ( (1/smallestElem) + (1 / greatestElem) );
            harmonic = 2 / tmp ;
        }catch(ArithmeticException ar){

            System.out.println("Impartire la 0 !!! ");
            ar.printStackTrace();
        }
        System.out.println("tmp = " + tmp);
        System.out.println("harmonic = " + harmonic);


    }


}