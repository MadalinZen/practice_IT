package PracticeIT_Cap1_Intro;

public class Shining2 {

    public static void main(String[] args) {

        writeText("All work and no play makes Jack a dull boy.");

    }

    static int i = 0 ;

    public static void writeText(String text){

        System.out.println(text);

        if (++i <=1000){

            writeText(text);
        }
    }
}
