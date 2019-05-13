package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class NestedLoops {

    public static void main(String[] args) {

        for (int i = 1 ; i <=10 ;i++){

            for (int j = 1 ; j <=10 - i ; j++){

                System.out.println(" ");
            }

            for (int j = 1 ; j < 2 * i - 1 ; j++){

                System.out.println("*");
            }

            System.out.println();
        }
    }
}
