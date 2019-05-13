package Practice_IT_Cap3_ParametersAndObjects;

public class CylinderSurfaceArea {

    public static void main(String[] args) {

        System.out.println(cylinderSurfaceArea(3.0,4.5));
    }


    public static double cylinderSurfaceArea(double radius , double  height){

        double area = 2 * 3.141592653589793 * Math.pow(radius,2) + 2 * 3.141592653589793 * radius * height ;

        return area;
    }
}
