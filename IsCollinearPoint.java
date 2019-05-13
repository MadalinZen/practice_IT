package Practice_IT_Cap8_Classes;

public class IsCollinearPoint {

    private int x ;

    private int y ;

    public IsCollinearPoint(int x , int y){

        this.x = x ;

        this.y = y ;

    }


    public boolean isCollinear(IsCollinearPoint p1, IsCollinearPoint p2 ){

        if(this.x == p1.x || this.x == p2.x)
            return this.x == p1.x && this.x == p2.x;

                   double valOne = (double) (this.y - p1.y ) / (double) (this.x - p1.x) ;

                   double valTwo = (double) (this.y - p2.y ) / (double) (this.x - p2.x) ;

                    if (valOne == valTwo){

                        return true ;
                    }

                    return false ;

        }


    public static void main(String[] args) {

        IsCollinearPoint pointOne = new IsCollinearPoint(9,5);
        IsCollinearPoint pointTwo = new IsCollinearPoint(3,7);


        final boolean collinear = pointOne.isCollinear(pointTwo);

        System.out.println(collinear);


    }

    private boolean isCollinear(IsCollinearPoint pointTwo) {

        return true ;
    }

}
