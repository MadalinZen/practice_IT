package Practice_IT_Cap3_ParametersAndObjects;

public class OppsErrors {

//    x = 10.01 and y = 8.0
//    x = 10.01 and y = 867.5309
//    The value from main is: 867.5309
//    z = 5



    public static void main(String[] args) {

double x=0.0;
double y = 0.0;
double bubble=867.5309;
double z = 5 ;

printer(10.01,8.0);
x = 10.01;
y = bubble;
printer(x,y);
System.out.println("The value from main is: " + bubble );
System.out.println("z = " + z);
}

public static void printer(double x, double y) {

System.out.println("x = " +  x + " and y = " + y);

}

    }

