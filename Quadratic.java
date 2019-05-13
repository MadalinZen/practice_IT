package Practice_IT_Cap3_ParametersAndObjects;

public class Quadratic {

    public static void main(String[] args) {


        quadratic(1, -7, 12);
        quadratic(1, -7, 12);
        quadratic(1, 3, 2);
        quadratic(4, 10, 5);
        quadratic(14, -25, 5);
    }


    public static void quadratic(int a, int b, int c) {

        double firstRoot = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);

        double secondRoot = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);

        System.out.println("First root = " + firstRoot + "\n" + "Second root = " + secondRoot);
    }
}
