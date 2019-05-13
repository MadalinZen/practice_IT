package PracticeIT_Cap4_ConditionalExecution;

public class Stutter {

    public static void main(String[] args) {

        System.out.println(stutter("hello"));
    }

    public static String stutter(String word){

//        String doubledWord = "";
//
//        for (int i = 0 ; i < word.length();++i){
//
//            doubledWord +=word.charAt(i) + "" + word.charAt(i) ;
//        }
//Action a = new Action(Type.FILTER_BY_YEAR,y);
//
//        return ""+doubledWord;

        String eachLetter = "";

        String newWord = "";


        for (int i = 0 ;i < word.length() ;++i){

            eachLetter = word.substring(i,i+1) ;//+ word.substring(i,i+1);

            System.out.println("eachLetter is : "+eachLetter);


            newWord +=eachLetter + eachLetter;

            System.out.println("newWord is: "+newWord);
        }

        return newWord;


    }




}
