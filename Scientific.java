package Practice_IT_Cap3_ParametersAndObjects;

public class Scientific {

    public static void main(String[] args) {

        System.out.println(scientific(6.23,5));
        System.out.println(scientific(1.9,-2));


    }

    public static double scientific(double base,double exponent){

        double res = base * Math.pow(10,exponent);

        return  res;
    }
}
