package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class DollarFigure2 {
    public static final int SIZE = 3 ;

    public static void main(String[] args) {

        for (int i = 0 ; i < SIZE;i++){

            for (int j=1;j<=i*2;j++){

                System.out.print("*");
            }

            for (int j = SIZE; j > i;j--){
                System.out.print("$");
            }

            for (int y = 2*SIZE; y > 2 * i;y--){

                System.out.print("*");
            }

            for (int t = SIZE ; t > i ;t--){

                System.out.print("$");
            }

            for (int r = 1 ; r<=2*i;r++){

                System.out.print("*");
            }

            System.out.println();





        }
    }
}