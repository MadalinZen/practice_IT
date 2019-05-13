package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class StartEndSame {

    public static void main(String[] args) {

        System.out.println(startEndSame("coco"));
        System.out.println(startEndSame("salas"));
        System.out.println(startEndSame("mancare"));
         System.out.println(startEndSame("apa"));
        System.out.println(startEndSame("nan"));


    }

    public static boolean startEndSame(String word){

        Boolean ZEN = false ;

        for (int i = 0 ; i < word.length();i++){

            if (word.charAt(0) == word.charAt(word.length()-1)){

                ZEN = true;

                break;
            }



        }

        return ZEN;


    }
}
