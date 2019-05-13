package PracticeIT_Cap4_ConditionalExecution;

public class PrintRange {

    public static void main(String[] args) {

        System.out.println(printRange(2, 7));
        System.out.println(printRange(19, 11));
        System.out.println(printRange(5, 5));

    }

    public static String printRange(int firstNumber, int secondNumber) {

        while (firstNumber != secondNumber) {
            System.out.print(firstNumber + " ");
            if (firstNumber < secondNumber)
                firstNumber++;
            else
                firstNumber--;
        }
        System.out.print(firstNumber);

        return "";
    }

}

