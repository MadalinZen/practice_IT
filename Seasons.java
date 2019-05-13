package PracticeIT_Cap4_ConditionalExecution;

public class Seasons {

    public static void main(String[] args) {

        System.out.println(seasons(7, 17));
        System.out.println(seasons(1, 1));
        System.out.println(seasons(10, 10));
        System.out.println(seasons(5, 22));

    }


    public static String seasons(int month, int day) {

        if (month < 3 || (month == 3 && day <= 15) || (month == 12 && day >= 16)) {
            return "Winter";
        } else if ((3 < month && month < 6) || (month == 3 && day >= 16) || (month == 6 && day <= 15)) {
            return "Spring";
        } else if ((6 < month && month < 9) || (month == 6 && day >= 16) || (month == 9 && day <= 15)) {
            return "Summer";
        } else {
            return "Fall";
        }


    }
}
