package Practice_IT_Cap3_ParametersAndObjects;

public class LargestAbsVal3param {

    public static void main(String[] args) {


        System.out.println(largestAbsVal(7,-2,-11));
        System.out.println(largestAbsVal(54,-54,30));


    }

    public static int largestAbsVal(int a, int b, int c) {

        int first = Math.abs(a);
        int second = Math.abs(b);
        int third = Math.abs(c);

        if ( (first > second) && (first > third) ) {

            return first;
        }
        if ( (second > first) && (second > third) ) {

            return second;
        }if ((first == second) || (first > third) || (second == third)) {

            return first ;
        }

        else {

            return third;
        }


    }

}
