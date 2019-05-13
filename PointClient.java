package Practice_IT_Cap8_Classes;

public class PointClient {

    public static void main(String[] args) {

        Point2 p1 = new Point2(8,2);

        Point2 p2 = new Point2(4,3);

        System.out.println("p1 is " + p1.toString());

        System.out.println("p2 is " + p2.toString());

        System.out.println("**********************");


       // p1.distanceFromOrigin();

        System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());

        System.out.println("**********************");


        p1.translate(1,2);

        p2.translate(-1,10);

        System.out.println("**********************");

        System.out.println("p1 is now" + p1.toString());

        System.out.println("p2 is now" + p2.toString());





    }
}
