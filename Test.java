package PracticeIT_Cap1_Intro;

public class Test {

    public static void main(String[] args) {

        System.out.println(2 + "(int) 2.0" + 2 * 2 + 2);

        int first = 8 , sec = 19 ;

        first += sec;

        sec =first -  sec;

        first -= sec;

        System.out.println(first);

        System.out.println(sec);

    }
}
