package PracticeIT_Cap4_ConditionalExecution;

public class CountFactors {

    public static void main(String[] args) {

        System.out.println(countFactors(12));
        System.out.println(countFactors(625));
        System.out.println(countFactors(24));

    }

    public static  int countFactors(int n){

        int count = 0 ;

        for (int i = 1 ; i <=n;++i){

            if (n % i == 0){

                count++;
            }
        }

        return count;
    }
}
