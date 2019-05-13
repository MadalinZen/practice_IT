package Practice_IT_Cap3_ParametersAndObjects;

public class Min3Num {

    public static void main(String[] args) {

        System.out.println(min(3,-2,7));
        System.out.println(min(19,27,6));



    }

    public static int min(int first,int second,int third){

        int x = Math.min(first,second);

        int y = Math.min(x,third);

        return y ;
    }
}
