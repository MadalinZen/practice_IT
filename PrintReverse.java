package Practice_IT_Cap3_ParametersAndObjects;

public class PrintReverse {

    public static void main(String[] args) {

        System.out.println(printReverse("hello there!"));

    }

    public static String printReverse(String word){

        for (int i = word.length()-1 ; i>= 0;i--){

            System.out.print(word.charAt(i));
        }

        return  "";
    }
}
