package Practice_IT_Cap3_ParametersAndObjects;

public class PrintSquare {

    public static void main(String[] args) {

        printSquare(0,3);


    }

    public static void printSquare(int min,int max){

        for (int i = min; i<= max;i++){

            System.out.print(i);

            for (int j = min+1;j<=max;j++){

                System.out.print(j);

                if (j == max ){

                    for ( int l =min+1; l>min+1;l--){

                        System.out.print(l);
                    }
                }
            }
            System.out.println();
        }
    }
}
