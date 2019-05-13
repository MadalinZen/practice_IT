package Practice_IT_Cap3_ParametersAndObjects;

public class VerticalWord {

    public static void main(String[] args) {

        vertical("hey now");

    }

    public static String vertical(String word){

        for (int i = 0 ; i < word.length();i++){

            System.out.println(word.charAt(i));
        }

        return  word;
    }
}
