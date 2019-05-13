package Practice_IT_Cap8_Classes;

public class IsVerticalPoint {

    private int x ;

    private int y ;

    public IsVerticalPoint(int x , int y){

        this.x = x ;

        this.y = y ;

    }


    public boolean isVertical(IsVerticalPoint other ){

        if (this.x == other.x ){

            return true ;
        }

        return false ;
    }

    public static void main(String[] args) {

        IsVerticalPoint p1 = new IsVerticalPoint(13,27);

        IsVerticalPoint p2 = new IsVerticalPoint(13,55);

        System.out.println(p1.isVertical(p2));


    }
}
