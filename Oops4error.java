package PracticeIT_Cap4_ConditionalExecution;

public class Oops4error {

    public static int smaller = 0 ;

    public static void main(String[] args) {

        int a = 7 ;
        int b = 42 ;
        minimum(a,b);
        if (a == smaller ){

            System.out.println("a is the smallest!");
        }
       // System.out.println("smaller is "+minimum(a,b));


    }

    public static int minimum(int a , int b ){

        if (a < b) {

             smaller = a ;
        }else if (a > b){

             smaller = b ;
        }

        return smaller;
    }
}
