package PracticeIT_Cap4_ConditionalExecution;

public class ReplicateText {

    public static void main(String[] args) {

        System.out.println(repl("surf",9));

    }


    public static String repl(String word,int nrOfRepetitions){

        if (nrOfRepetitions <= 0 ){

            System.out.println("Empty string ");
        }


        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < nrOfRepetitions;++i){

            sb.append(word+" ");
        }

        return sb.toString();

    }
}
