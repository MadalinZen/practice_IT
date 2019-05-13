package PracticeIT_Cap4_ConditionalExecution;

public class SecondhalfLetters {

    public static void main(String[] args) {

        System.out.println(secondHalfLetters("ruminates"));

    }

    public static int secondHalfLetters(String word){

        int count = 0 ;

        char [] charSet =  word.toCharArray();

        for(int i=0; i < word.length(); ++i) {

            for (char letter = 'N'; letter<='Z';letter++) {

                if ((word.charAt(i)) == letter)
                    count++;
                //System.out.println(letter);
            }
            System.out.println();
        }


//        for (char letter = 'N'; letter <= 'Z';letter++){
//
//            if ()
//
//            System.out.print(letter);
//        }

//        System.out.println();

        return count;
    }
}
