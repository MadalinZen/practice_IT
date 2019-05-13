package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class VariableY {

    public static void main(String[] args) {

        double x = 3;

        //double y = x*(12.3* x^3 -9.1* x^2+19.3 * x -4.6)+34.2;

        double y =  x *  ( (12.3 * (Math.pow(x,3))) - (9.1*(Math.pow(x,2))) + (19.3 *x) - 4.6 ) + 34.2 ;

        System.out.println(y);
    }
}
