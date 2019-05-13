package Practice_IT_Cap3_ParametersAndObjects;

public class PadString {

    public static void main(String[] args) {

        System.out.println(padString("hello",8));
        System.out.println(padString("congratulations",10));
    }


    public static String padString(String word,int length){


        StringBuilder sb = new StringBuilder();

        int stringLength = word.length();

        System.out.println(stringLength);

        do {

            sb.append("*").append(word);
        } while(stringLength == length);

        return word;
    }
}
