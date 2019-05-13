package PracticeIT_Cap4_ConditionalExecution;

public class SplitAString {

    public static void main(String[] args) {

        String str = "name1, name2, name3, name4";

        String[] parts = str.split(", ", 2);
        String string1 = parts[0];
        String string2 = parts[1];

        System.out.println(string1);  // prints name1
        System.out.println(string2);  // prints name2, name3, name4

    }
}
