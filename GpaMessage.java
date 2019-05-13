package PracticeIT_Cap4_ConditionalExecution;

public class GpaMessage {

    public static void main(String[] args) {

    double gpa = 3.2;

//     Double credits = new Double(gpa * 3) ;
//
//     Double resToGet =new Double(9.6) ;
//
//        int result = credits.compareTo(resToGet);
//
//        if(result > 0){
//            System.out.println("First is grater");
//        }else if(result < 0){
//            System.out.println("Second is grater");
//        }else{
//            System.out.println("Both are equal");
//        }
//
//
//        if (9.6 == 9.6 ){
//
//            System.out.println("You earned enough credits.");
//        }

        double credits = gpa * 3  ;

        double resToGet = 9.6;

        double TRESHOLD = 0.000001;

        if (Math.abs( credits - resToGet) < TRESHOLD){

            System.out.println("Numbers are equal");
        }else{
            System.out.println("Not equal");
        }

        System.out.println(credits - resToGet);





    }

}
