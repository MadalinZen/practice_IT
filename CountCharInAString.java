package PracticeIT_Cap4_ConditionalExecution;

public class CountCharInAString {

    public static void main(String[] args) {

        System.out.println("The number of char is: "+countChar("engineer",'e'));
        System.out.println("The number of char is: "+countChar("mascarade",'a'));
        System.out.println("The number of char is: "+countChar("sashimi",'i'));


//        String word = "engineer";
//        char someChar = 'e';
//        int counter = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == someChar){
//
//                counter++;
//            }
//
//        }
//        System.out.println(counter + " chars.");

        }



    public static int countChar(String word, char c) {
        int count = 0;

        for(int i=0; i < word.length(); i++)
        {    if((word.charAt(i)) == c)
            count++;
        }

        return count;
    }


    }

