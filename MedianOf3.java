package PracticeIT_Cap4_ConditionalExecution;

public class MedianOf3 {

    public static void main(String[] args) {

        System.out.println(medianOf3(1,3,5));
        System.out.println(medianOf3(15,3,31));

    }


    public static int medianOf3(int n1 , int n2,int n3){

        if (n1 > n2) {
            if (n2 > n3) {
                return n2;
            } else if (n1 > n3) {
                return n3;
            } else {
                return n1;
            }
        } else {
            if (n1 > n3) {
                return n1;
            } else if (n2 > n3) {
                return n3;
            } else {
                return n2;
            }
        }
    }
}
