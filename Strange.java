package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class Strange {

    public static final int MAX = 5 ;

    public static void main(String[] args) {

    unknown();

    }


    public static void unknown(){

        int number = 0 ;

        for (int count = MAX ; count>=1;count--){

            number =+ number+(count * count);

            System.out.println("Rez at each step is : "+ number);
        }

        System.out.println("The result is : " + number);
    }
}
