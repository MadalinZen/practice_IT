package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class LoopTable {

    static int  coefficient = 4 ;
     static int constant = 0 ;
     static int rez = 0 ;

    public static void main(String[] args) {
        for(int count = 1;count<30;count++,constant++) {

            rez = coefficient * count + constant;

            System.out.println("rezultat = " +rez );
        }
    }
}