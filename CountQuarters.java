package Practice_IT_Cap3_ParametersAndObjects;

public class CountQuarters {

    public static void main(String[] args) {

        int number = 0 ;
        System.out.println(countQuarters(64));
        System.out.println(countQuarters(1278));

    }

    public static int countQuarters(int number){

        int count = 0 ;
        int numberOfQuarters = 0 ;

        numberOfQuarters = number / 25 + count ;

         count = number % 25 ;

        return numberOfQuarters;

    }
}
