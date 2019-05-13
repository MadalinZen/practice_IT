package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class Loops {

    public static void main(String[] args) {

        for (int i = 1 ; i <= 10; i++){

            for (int j = 1 ; j <=10-i;j++){

                System.out.print(" ");
            }

            for (int s = 1 ; s <= 2 * i -1 ; s++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
