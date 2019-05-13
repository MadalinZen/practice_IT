package Practice_IT_Cap5_LogicAndIndefiniteLoops;

import java.util.Scanner;

public class isVowel {

    public static void main(String[] args) {

        char[] charArray = new char[100];

        charArray = new char[]{'a', 'e', 'i', 'o', 'u'};

        // isVowel(charArray);
        System.out.println(isVowel(charArray));


    }

    public static Boolean isVowel(char[] charArray) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a letter :");

        String singleLetter = scan.next();

//        char newCharacter = singleLetter.charAt(0);
//
//        System.out.println(newCharacter);
//
        StringBuilder sb = new StringBuilder();

        for (char character : charArray) {

            sb.append(character);
        }

        String newVoweString = sb.toString();

        System.out.println(newVoweString);

        for (int i = 0; i < newVoweString.length(); ++i) {

            char charFromString = singleLetter.charAt(0);

            for (char c : charArray) {

                switch (charFromString) {

                    case 'a':
                        return true;
                    case 'e':
                        return true;
                    case 'i':
                        return true;
                    case 'o':
                        return true;
                    case 'u':
                        return true;
                }
            }
        }


        return false;
    }

}


