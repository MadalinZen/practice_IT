package Practice_IT_Cap5_LogicAndIndefiniteLoops;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

//        boolean checkPrime = true;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Insert number : ");
//        int number = scan.nextInt();

//        int a = 2;
//        while(a <= number / 2)
//        {
//            if(number % a == 0)
//            {
//                checkPrime = false;
//                break;
//            }
//            a++;
//        }
//
//        if(checkPrime)
//            System.out.println(number + " is a prime number.");
//        else
//            System.out.println(number + " is not a prime number.");
//        scan.close();


        System.out.println(isPrime(13));
        System.out.println(isPrime(15));
        System.out.println(isPrime(31));
        System.out.println(isPrime(88));
        System.out.println(isPrime(97));
        System.out.println(isPrime(66));
        System.out.println(isPrime(55));

    }

    public static boolean isPrime(int n){

        boolean prime = true ;

        for (int i = 2 ; i < n ; i++ ){

            if ( n % i == 0 ){

                prime = false ;
                break;
            } else {

                prime = true ;
            }

        }

        return prime ;

    }


}
