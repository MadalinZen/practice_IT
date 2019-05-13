package Practice_IT_Cap8_Classes;

public class ManhattanDistancePoint {

    private int x ;

    private int y ;

    public ManhattanDistancePoint(int x , int y){

        this.x = x ;

        this.y = y ;

    }


    public int manhattanDistancePoint(ManhattanDistancePoint other ){

        int dist = Math.abs(this.x-other.x) + Math.abs(this.y-other.y);

        return dist;
    }

    public static void main(String[] args) {

        ManhattanDistancePoint p1 = new ManhattanDistancePoint(5,7);

        ManhattanDistancePoint p2 = new ManhattanDistancePoint(10,3);

        System.out.println(p1.manhattanDistancePoint(p2));


    }
}
