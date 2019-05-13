package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class PlayingCard {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        playingCard(scan);

    }




    public static String playingCard(Scanner scan){

        System.out.print("Enter a card: ");
        String card = scan.nextLine();


        if (card.equalsIgnoreCase("2 C")){

            System.out.println("Two of Clubs");
        }else if(card.equalsIgnoreCase("2 D")){

            System.out.println("Two of Diamonds");
        }else if (card.equalsIgnoreCase("2 H")){

            System.out.println("Two of Hearts");
        }else if (card.equalsIgnoreCase("2 S")) {

            System.out.println("Two of Spades");
        }else if (card.equalsIgnoreCase("6 C")){

            System.out.println("Six of Clubs");
        }else if(card.equalsIgnoreCase("6 D")){

            System.out.println("Six of Diamonds");
        }else if (card.equalsIgnoreCase("6 H")){

            System.out.println("Six of Hearts");
        }else if (card.equalsIgnoreCase("6 S")) {

            System.out.println("Six of Spades");
        } else if (card.equalsIgnoreCase("9 C")){
            System.out.println("Nine of Clubs");
        }else if(card.equalsIgnoreCase("9 D")){

            System.out.println("Nine of Diamonds");
        }else if (card.equalsIgnoreCase("9 H")){

            System.out.println("Nine of Hearts");
        }else if (card.equalsIgnoreCase("9 S")) {

            System.out.println("Nine of Spades");
        }else if (card.equalsIgnoreCase("10 C")){

            System.out.println("Ten of Clubs");
        }else if(card.equalsIgnoreCase("10 D")){

            System.out.println("Ten of Diamonds");
        }else if (card.equalsIgnoreCase("10 H")){

            System.out.println("Ten of Hearts");
        }else if (card.equalsIgnoreCase("10 S")){

            System.out.println("Ten of Spades");
        }else if (card.equalsIgnoreCase("J C")){

            System.out.println("Jack of Clubs");
        }else if(card.equalsIgnoreCase("J D")){

            System.out.println("Jack of Diamonds");
        }else if (card.equalsIgnoreCase("J H")){

            System.out.println("Jack of Hearts");
        }else if (card.equalsIgnoreCase("J S")){

            System.out.println("Jack of Spades");
        }
        if (card.equalsIgnoreCase("Q C")){

            System.out.println("Queen of Clubs");
        }else if(card.equalsIgnoreCase("Q D")){

            System.out.println("Queen of Diamonds");
        }else if (card.equalsIgnoreCase("Q H")){

            System.out.println("Queen of Hearts");
        }else if (card.equalsIgnoreCase("Q S")){

            System.out.println("Queen of Spades");
        }else if (card.equalsIgnoreCase("K C")){

            System.out.println("King of Clubs");
        }else if(card.equalsIgnoreCase("K D")){

            System.out.println("King of Diamonds");
        }else if (card.equalsIgnoreCase("K H")){

            System.out.println("King of Hearts");
        }else if (card.equalsIgnoreCase("K S")){

            System.out.println("King of Spades");
        }
        else if (card.equalsIgnoreCase("A C")){

            System.out.println("Ace of Clubs");
        }else if(card.equalsIgnoreCase("A D")){

            System.out.println("Ace of Diamonds");
        }else if (card.equalsIgnoreCase("A H")){

            System.out.println("Ace of Hearts");
        }else if (card.equalsIgnoreCase("A S")){

            System.out.println("Ace of Spades");
        }

        return "";

    }
}
