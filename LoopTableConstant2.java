package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class LoopTableConstant2 {

        public static void main(String[] args) {

            int [] line = {1,2,3,4,5,6,7,8,9};

            int coef1 = 4 ,coef2 = 3 ,Size = 5 ,offSet = 0 ,rez = 0;

            for (int i = 0 ; i <=line.length-1;i++){

                rez = coef1 * line[i] + (coef2 * Size + offSet)  ;

                System.out.println("Result is now : "+"coef1: "+coef1+" * line["+i+"]:"+line[i] +" "+"(coef2: "+coef2+" * Size: "+Size+ " +offSet: "+offSet+") = "+ rez);
            }
        }
    }


