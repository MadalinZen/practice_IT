package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class RecursiveSum {

    public static void main(String[] args) {

        System.out.println("Recursive sum is : " +sum(3));
    }

    public static int sum(int k) {

        if (k==1){

            return 1;
        } else{

            return k + sum(k-1);
        }
    }
}
