package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class printLetters {

    public static void main(String[] args) {


        printLetters("Rabbit");
        System.out.println();
        System.out.println(removeLastChar("R-a-b-b-i-t-"));


    }

    public static String printLetters(String name) {

        if (name == "") {

            return "";
        }

        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i) + "-");

        }

        return name;
    }

    public static String removeLastChar(String name) {

        if (name != null && name.length() > 0 && name.charAt(name.length() - 1) == '-') {

            name = name.substring(0, name.length() - 1);
        }

        return name;
    }

}
