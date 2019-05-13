package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class LoopSequence2cuCast {

    public static void main(String[] args) {

        double ct = -18, rez = -22;

        for (int i = 1; i <= 6; i++) {

            rez = ((rez / i) * i) - ct;

            System.out.println((int)rez);


        }
    }
}
