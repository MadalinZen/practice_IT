package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class fibonacci {

    public static void main(String[] args) {


        int n = 12;
        int[] sir = new int[n];
        sir[0] = 1;
        sir[1] = 1;
        int fib1 = 1;
        int fib2 = 1;
        int fib3;
        int i;


        System.out.print(fib1 + " " + fib2);
        for (i = 2 ; i < n; i++){
            fib3 = fib1 + fib2;
            System.out.print(" " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
