package Practice_IT_Cap3_ParametersAndObjects;

public class sphereVolume {

    public static void main(String[] args) {

        System.out.println(sphereVolume(2));
    }


    public static double sphereVolume(double radius ){

        double area = 4/3 * 3.141592653589793 * Math.pow(radius,3) ;

        return area;
    }
}
