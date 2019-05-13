package Practice_IT_Cap3_ParametersAndObjects;

public class PrintStrings {

    public static void main(String[] args) {

        String word = "";
        int numberOfPrints = 0 ;
        printStrings("abc",5);

    }

    public static void printStrings(String word,int numberOfPrints){

        for (int i = 0 ; i < numberOfPrints;i++){

            System.out.print(word);
        }
    }
}
