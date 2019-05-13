package Practice_IT_Cap5_LogicAndIndefiniteLoops;

public class ForToWhile {

    public static void main(String[] args) {

        System.out.println("a.");

        int n = 1 ;

        while( n < 5){

            System.out.println(n);
            n++;
        }
        System.out.println(n);

        System.out.println();


        System.out.println("b.");

        int total = 25 ;

        int number = 1 ;

        while(number <= total / 2){

            total = total - number;
            System.out.println(total +" " + number);
            number++;

        }

        System.out.println();

        System.out.println("c.");

        for (int i = 1 ; i <=2 ;i++){

            for (int j = 1 ; j<=3;j++){

                for (int k = 1 ; k <=4;k++){

                    System.out.print("*");
                }

                System.out.print("!");
            }
            System.out.println();
        }

        System.out.println();


        int z = 1 ;

        int nrRepet = 1 ;

        while(nrRepet <=2) {

            z =  1 ;

            do {
                System.out.print("****!");
                z++;
            }while( z <=3 );

            nrRepet++;

            System.out.println();
        }

        System.out.println("d.");

            int number2 = 4 ;
            int count = 1;
            while(count <=number2){

                System.out.println(number2);
                number2 /= 2 ;
                count++;
            }

        System.out.println();
    }
}
