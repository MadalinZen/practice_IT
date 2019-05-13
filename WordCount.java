package PracticeIT_Cap4_ConditionalExecution;

public class WordCount {

    public static void main(String[] args) {

        System.out.println(wordCount("hello"));
        System.out.println(wordCount(" this     string has     wide       spaces "));
        System.out.println(wordCount("how are you?"));
        System.out.println(wordCount("Cat    Dog \t Elephant \n Fox \r\n Goat"));
    }

    public static int wordCount(String word) {

        String[] arrayOfStrings = word.split(" "+"\\s+");

        // arrayOfStrings = word.split("\\s+");

        int count = 0 ;

        for ( int i = 0 ; i < arrayOfStrings.length;++i) {

            String ss = arrayOfStrings[i];

            System.out.println(ss);
            count++;
        }

        return count;

    }
}