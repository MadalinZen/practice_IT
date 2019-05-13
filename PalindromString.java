package PracticeIT_Cap4_ConditionalExecution;

public class PalindromString {

    public static void main(String[] args) {

        String word = "rotitor";

        boolean flag = true ;

        for (int i = 0 ; i < word.length() / 2;++i){

            if ( word.charAt(i) != word.charAt(word.length()-1 -i ) ){

                System.out.println("cuvantul " + word + " NU este palindrom ");

                flag = false ;

                //break;
            }
        }

        if ( flag == true ){

            System.out.println("cuvantul " + word + " ESTE palindrom ");
        }
    }
}
