package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class ContainsAGivenString {

    public static void main(String[] args) {

        System.out.println(contains("pineapple",'n'));
        System.out.println(contains("love",'l'));
        System.out.println(contains("snowboard",'b'));


    }

    public static boolean contains(String str, char ch){

        boolean found = false;

        for (int i = 0 ; i < str.length(); i++){

            if (str.charAt(i) == ch ){

                System.out.println(str+".charAt("+i+")="+str.charAt(i));

                found = true;
            }

          //  return false ;
        }

        return found ;
    }
}
