package Practice_IT_Cap8_Classes;

public class SlopePoint {

    private int x ;

    private int y ;

    public SlopePoint(int x , int y){

        this.x = x ;

        this.y = y ;

    }


    public double slope(SlopePoint other ){

        if ( this.x == other.x){

            throw new IllegalArgumentException("Select different values for x !!! ");
        }

        double slope = (double) (other.y - this.y)  /  (double) (other.x-this.x) ;

        return   slope;
    }

    public static void main(String[] args) {

        SlopePoint p1 = new SlopePoint(0,0);

        SlopePoint p2 = new SlopePoint(20,10);

        System.out.println(p1.slope(p2));


    }
}
