package Practice_IT_Cap8_Classes;

public class DistanceBt2Points {

    int x ;

    int y ;

    public DistanceBt2Points(int x , int y){

        this.x = x ;

        this.y = y ;

    }


    public static double distance(Point p1 , Point p2 ){

        double dist = Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2);

        return dist;
    }

    public static void main(String[] args) {

        Point p1 = new Point(3,4);

        Point p2 = new Point(5,6);

        System.out.println(distance(p1,p2));


    }
}
