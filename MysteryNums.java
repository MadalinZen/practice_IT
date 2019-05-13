package Practice_IT_Cap3_ParametersAndObjects;

public class MysteryNums {

    public static void main(String[] args) {

        int x = 15 ;

        sentance(x,42);

        int y = x - 5 ;

        sentance(y,x+y);


    }

    public static void sentance(int num1,int num2){

        System.out.println(num1 + " " + num2);
    }
}
