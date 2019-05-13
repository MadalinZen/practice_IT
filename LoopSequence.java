package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class LoopSequence {

    public static void main(String[] args) {



        for (int i = 1, rez = -22; i <= 6; i++,rez+=18) {

            int ct = -18;// rez = -22;

            rez = ((rez / i) * i) - ct;

            System.out.println(rez);


        }
    }

}
