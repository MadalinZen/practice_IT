package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class DollarFigure {

    public static void main(String[] args) {

        for (int i = 0 ; i < 7;i++){

            for (int j=1;j<=i*2;j++){

                System.out.print("*");
            }

            for (int j = 7; j > i;j--){
                System.out.print("$");
            }

            for (int y = 14; y > 2 * i;y--){

                System.out.print("*");
            }

            for (int t = 7 ; t > i ;t--){

                System.out.print("$");
            }

            for (int r = 1 ; r<=2*i;r++){

                System.out.print("*");
            }

            System.out.println();





        }
    }
}
