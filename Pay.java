package Practice_IT_Cap3_ParametersAndObjects;

public class Pay {

    public static void main(String[] args) {

        System.out.println(pay(5.5,6));
        System.out.println(pay(4,11));
        System.out.println(pay(10,40));
        System.out.println(pay(0,20));


    }

    public static String pay(double salary,double nrOfHours){

        double res = salary * nrOfHours ;

        if (nrOfHours > 8){

            res = salary * 8 + 6.0 * 3 ;
        }

        if (nrOfHours >= 20 ){

            res = nrOfHours * salary + nrOfHours * 4 ;
        }

        if (nrOfHours >=20 && salary==0){

            res = 0 ;
        }

        return "pay : " + res;
    }
}
