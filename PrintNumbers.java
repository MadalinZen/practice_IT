package Practice_IT_Cap3_ParametersAndObjects;

public class PrintNumbers {

    public static void main(String[] args) {

        printNumbers(15);
        printNumbers(5);

    }


    public static void printNumbers(int maxNumber){

        for (int i = 0 ; i <=maxNumber;i++){

            System.out.print("["+ i + "]");
        }
    }
}
