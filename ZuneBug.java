package Practice_IT_Cap5_LogicAndIndefiniteLoops;

import java.time.LocalDate;
import java.time.Period;

public class ZuneBug {

    public static void main(String[] args) {

        LocalDate endofCentury = LocalDate.of(1980, 01, 01);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(endofCentury, now);

        System.out.printf("Difference is %d years, %d months and %d days old",
                diff.getYears(), diff.getMonths(), diff.getDays());



        int days = diff.getMonths();

        int year = 1980 ;

        while (days > 365 ){

            if (isLeapYear(year)){

                if (days > 366 ){

                    days -= 366;

                    year += 1 ;
                }else{

                    days -= 365;

                    year += 1 ;
                }
            }
        }

    }

    public static int daysInMonth(int m, int y) {
        int d;
        if (m == 1 || m == 3 || m == 5 || m == 7
                || m == 8 || m == 10 || m == 12) {
            d = 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            d = 30;
        } else if (isLeapYear(y) && m == 2) {
            d = 29;
        } else if (m == 2) {
            d = 28;
        } else {
            d = 0;
        }
        return d;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
