package PracticeIT_Cap2_PrimitiveData_DefiniteLoops;

public class BadNews {

    public static final int MAX_ODD =21;

    static int count = 0 ;

    public static void writeOdds(){

        // print each odd number

        for (  count = 1 ; count <=MAX_ODD - 2;count+=2){

            System.out.print(count + " ");

           // count +=2;
        }

        // print the last odd number
        System.out.println(count  );
    }

    public static void writeOdds2(){

        // print each odd number

        for (  count = 1 ; count <=9;count+=2){

            System.out.print(count + " ");


        }

        System.out.println(count  );
    }

    public static void main(String[] args) {

        // write all odds up to 21
        writeOdds();

        // now write all odds up to 11
        //MAX_ODD = 11;
        writeOdds2();
    }

}

