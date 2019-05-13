package Practice_IT_Cap3_ParametersAndObjects;

public class PrintsPowersOf2 {

    public static void main(String[] args) {

        printPowersOf2(3);
        printPowersOf2(10);
        printPowersOf2(15);


    }


    public static void printPowersOf2(int powerOf2){

        for (int i = 0 ; i <=powerOf2;i++){

            double res = Math.pow(2,i);

            System.out.print((int)res+" ");
        }
        System.out.println();
    }
}
