package PracticeIT_Cap4_ConditionalExecution;

public class CapitalLetter {

    public static void main(String[] args) {

        String phrase ="Surf";

        if (Character.isUpperCase(phrase.charAt(0))){

            System.out.println("capital.");

        }else {

            System.out.println("not capital.");
        }
    }
}
