package PracticeIT_Cap4_ConditionalExecution;

import java.util.ArrayList;

public class CharacterCounter {

    public static void main(String[] args) {

        String string = "sashimi";
        int count = 0;
        ArrayList<Character> c = new ArrayList<Character>();
        for(int i =0; i <string.length(); i++)
        {
            count=0;
            if(c.contains(string.charAt(i)))
            {
                continue;
            }
            c.add(string.charAt(i));
            for(int j = 0;j<string.length();j++)
            {

                if(string.charAt(j) == string.charAt(i))
                {

                    count++;

                }


            }
            System.out.println("The number of letter "+string.charAt(i)+" is " + count);
        }
    }
}
