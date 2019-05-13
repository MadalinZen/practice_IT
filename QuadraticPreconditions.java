package PracticeIT_Cap4_ConditionalExecution;

public class QuadraticPreconditions {

    public static void main(String[] args) {

        quadraticPreconditions(1, -7, 12);
        quadraticPreconditions(1, 3, 2);
        quadraticPreconditions(2, 4, 5);
        quadraticPreconditions(4, 10, 5);
        quadraticPreconditions(14, -25, 5);

    }

    public static void quadraticPreconditions(int a, int b, int c) throws IllegalArgumentException {

        double firstRoot = 0;

        double secondRoot = 0;

        double delta = 0;

        delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println(delta);

        if (a == 0) {

            throw new IllegalArgumentException("Illegal argument Exception");


        } else if (delta < 0) {

            throw new IllegalArgumentException("Illegal argument Exception");


        } else if (delta == 0) {

            firstRoot = secondRoot;

            secondRoot = -(b / 2 * a);

        } else {

             firstRoot = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);

             secondRoot = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
        }


        System.out.println("First root = " + firstRoot + "\n" + "Second root = " + secondRoot);

    }
}
