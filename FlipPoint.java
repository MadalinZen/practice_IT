package Practice_IT_Cap8_Classes;

public class FlipPoint {

    public int x;

    public int y ;

    public FlipPoint(int x , int y){

        this.x = x ;

        this.y = y ;

    }

    public void setX(int x ){

        this.x = x ;
    }

    public void setY(int y ){

        this.y = y ;
    }

    public final int getX(){

        return x;
    }

    public final int getY(){

        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public FlipPoint flipPoint(int x , int y){

        return new FlipPoint(-y,-x);
    }

    public static void main(String[] args) {

        FlipPoint fp = new FlipPoint(1,1);

        // BEFORE FLIP

        System.out.println(fp.toString());

        System.out.println("***************");

        // AFTER FLIP

        System.out.println(fp.flipPoint(5,-3));

        System.out.println(fp.flipPoint(4,17));
    }

}
