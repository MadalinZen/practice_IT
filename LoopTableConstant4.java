package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class LoopTableConstant4 {


        public static void main(String[] args) {

            int [] line = {1,2,3,4,5,6,7,8,9,10,11/*,12,13,14,15*/};

            int coef1 = -1 ,coef2 = 2 ,Size = 9 ,offSet = 3 ,rez = 0;

            for (int i = 0 ; i<=line.length-1;i++){

                rez = coef1 * line[i] + (coef2 * Size + offSet)  ;

                System.out.println("Result is now : "+"coef1: "+coef1+" * line["+i+"]:"+line[i] +" "+"(coef2: "+coef2+" * Size: "+Size+ " +offSet: "+offSet+") = "+ rez);
            }
        }
    }

