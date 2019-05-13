package PracticeIT_Cap4_ConditionalExecution;

public class Average {

    public static void main(String[] args) {

        System.out.println(average(3,4));
        System.out.println(average(7,6));
        System.out.println(average(-1,-9));

    }


    public static double average(int a,int b){

        return (a+b) / 2.0 ;
    }
}
