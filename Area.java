package Practice_IT_Cap3_ParametersAndObjects;

public class Area {

    public static final double PI = 3.1415;

    public static void main(String[] args) {

        System.out.println(area(2.0));


    }


    public static double area(double radius){

        double areaCircle = PI * Math.pow(radius,2);

        return  areaCircle;
    }
}
