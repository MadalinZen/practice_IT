package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class randomOver900 {

    public static void main(String[] args) {

        int randomNumber = 0 ;

        int greatherThan900 = 0 ;


        do {

            randomNumber =(int) (Math.random() * 999  ) ;

            System.out.println("Random number: " +randomNumber);


            if ( randomNumber >= 900 ){

                greatherThan900 = randomNumber;
            }

        }while(greatherThan900 < 899 );


    }
}
