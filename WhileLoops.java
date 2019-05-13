package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class WhileLoops {

    public static void main(String[] args) {

//        int x = 250 ;
//
//        while( x % 3 != 0 ){
//
//            System.out.println(x);
//        }

        int x = 2 ;

        while (x < 200){

            System.out.println(x+" ");

            x *= x;
        }


        String word = "a";

        while(word.length() < 10){

            word = "b" + word + "b";
            System.out.println(word);

        }

        System.out.println(word);

        int y = 100;

        while(y >0){

            System.out.println(y/10);

            y = y / 2 ;

           // System.out.println(y);
        }
    }
}
