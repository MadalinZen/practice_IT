package Practice_IT_Cap3_ParametersAndObjects;

public class LargerAbsVal {

    public static void main(String[] args) {


        System.out.println(largerAbsVal(11,2));
        System.out.println(largerAbsVal(4,-5));
    }

    public static int largerAbsVal(int a,int b){

        int first = Math.abs(a);
        int second = Math.abs(b);

       if (first > second){

           return first;
       }else{

           return  second;
       }


    }
}
