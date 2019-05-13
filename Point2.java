package Practice_IT_Cap8_Classes;

public class Point2 {

    public int x ;
    public int y ;

    public Point2(){

        setLocation(0,0);
    }

    public Point2(int x , int y){

        setLocation(x,y);
    }

    public void setLocation(int x , int y){

        this.x = x;
        this.y = y;
    }

    public void setX(int x ){

        this.x = x ;
    }

    public void setY(int y ){

        this.y = y ;
    }


    public double distanceFromOrigin(){

        return distance(new Point2()) ;
    }

    public double distance(Point2 p) {

        int dx = x - p.x;
        int dy = y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }


    public final int getX(){

        return x;
    }

    public final int getY(){

        return y;
    }



    @Override
    public String toString() {
        return "(" +
                 x +
                ", " + y +
                ")";
    }

    public void translate(int dx , int dy){

        setLocation(x+dx,y+dy);
    }
}
