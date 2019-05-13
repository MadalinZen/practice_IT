package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class DoWhileLoops {

    public static void main(String[] args) {

        int x = 1 ;
        do {

            System.out.println("x = "+x);

            x+=10;
        }while(x < 100);

        System.out.println("***************");


    //    int max = 10 ;

        // infinity

//        do {
//            System.out.println("count down :"+max);
//            max--;
//        }while(max < 10);


        // infinity
//        int w = 250;
//
//        do {
//            System.out.println(w);
//        }while(w % 3 != 0 );

        System.out.println("***************");

        int p = 100;
        do {
            System.out.println(p);
            p /=2;
        }while(p % 2 ==0);

        System.out.println("***************");

        int u = 2 ;

        do {
            System.out.println(u);

            u *=u;
        }while(u < 200 );

        System.out.println("***************");

        String word = "a";

        do {
            word = "b" + word + "b";
            System.out.println(word);
        }while(word.length() < 10);
        System.out.println(word);

        System.out.println("***************");

        int t = 100;
        do {
            System.out.println(t/10);
            t /= 2;
        }while (t > 0 );

        System.out.println("***************");

        String str = "/\\";

        do {
            str += str;
            System.out.println(str);
        }while(str.length()<10);
        System.out.println(str);



    }
}
