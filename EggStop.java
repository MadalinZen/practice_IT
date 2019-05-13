package PracticeIT_Cap1_Intro;

public class EggStop {

    public static void main(String[] args) {

        eggOne();
        System.out.println();
        eggOne();
        eggTwo();
        System.out.println();
        eggStop();
        eggTwo();


    }

    public static void eggOne(){

        System.out.println("  ______\n" +
                " /      \\\n" +
                "/        \\\n" +
                "\\        /\n" +
                " \\______/");
    }

    public static void eggTwo(){

        System.out.println("+--------+");
    }

    public static void eggStop(){

        System.out.println("  ______\n" +
                " /      \\\n" +
                "/        \\\n" +
                "|  STOP  |\n" +
                "\\        /\n" +
                " \\______/");
    }
}
