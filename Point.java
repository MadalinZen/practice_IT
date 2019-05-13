package Practice_IT_Cap8_Classes;

public class Point {

    public int x;

    public int y ;

    public Point(int x , int y){

        this.x = x ;

        this.y = y ;

    }



    public static void main(String[] args) {

        Point pt = new Point(5,-17);

        System.out.println(pt);


    }


    @Override
    public String toString(){

        return "java.awt.Point[x="+x+",y="+y+"]";
    }
}
