package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class RecursiveFactorial {

    public static void main(String[] args) {

        System.out.println(fact(4));
    }

    public static int fact(int k ){

        if (k ==1 ){

            return 1 ;
        }else{

            return k * fact(k-1);
        }
    }
}
