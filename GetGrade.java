package PracticeIT_Cap4_ConditionalExecution;

public class GetGrade {

    public static void main(String[] args) {

        //System.out.println(getGrade(60));
        System.out.println(getGrade(63));
        System.out.println(getGrade(66));

    }

    public static double getGrade(int score) throws IllegalArgumentException {

        double grade = 0.0;

        if ((score <= 0) || (score > 100) ){

            throw new IllegalArgumentException("IllegalArgumentException.Value off [0.100]");
        }

        if (score < 60){

            grade = 0.0;
        }else if ( (score >= 60)  && (score <=62)){

            grade = 0.7;
        }else if((63 <= score || (score <=94))){

            grade = 0.8 + (score - 63) * 0.1;


        }else if(score >=95 ){

            grade = 4.0;
        }


        return grade ;
    }
}
