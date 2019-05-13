package PracticeIT_Cap4_ConditionalExecution;

public class TriangleType {

    public static void main(String[] args) {

        System.out.println(printTriangleType(5,7,7));
        System.out.println(printTriangleType(6,6,6));
        System.out.println(printTriangleType(5,7,8));
        System.out.println(printTriangleType(12,18,12));


    }

    public static String printTriangleType(int a,int b , int c){

        if ( (a == b) && (a == c) && (b == c) ){

            System.out.println("equilateral");
        } else if ( (a==b) || (b==c) || (a==c) ){

            System.out.println("isosceles");
        } else {

            System.out.println("scalene");
        }

        return "";
    }
}
