package Practice_IT_Cap8_Classes;

public class SetXYPoint {

    int x ;

    int y ;

    public SetXYPoint(int x , int y){

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

    public static void main(String[] args) {

        SetXYPoint setXYPoint = new SetXYPoint(1,1);

        System.out.println(setXYPoint.toString());

        setXYPoint.setX(3);

        setXYPoint.setY(5);

        System.out.println(setXYPoint.toString());
    }

    @Override
    public String toString() {
        return "SetXYPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
