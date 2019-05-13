package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class LoopTable1 {

        static int  coefficient = 19 ;
        static int constant = -15 ;
        static int rez = 4 -constant ;

        public static void main(String[] args) {
            for(int count = 1;count<35;count++,coefficient+=15) {

                rez = coefficient * count + constant;

                System.out.println("rezultat = " +rez );
            }
        }
    }

