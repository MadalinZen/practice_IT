package PracticeIT_Cap4_ConditionalExecution;

public class LastFirst {

    public static void main(String[] args) {

        System.out.println(lastFirst("Marla Singer"));


    }


    public static String lastFirst(String word){

        String [] strgs = word.split(" ");

        String word1 = strgs[0];
        String word2 = strgs[1];

        System.out.println(word1);
        System.out.println(word2);


        return  word2 + ", " + word1.charAt(0)+  "."  ;
    }
}
