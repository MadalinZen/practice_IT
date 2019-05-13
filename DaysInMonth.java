package PracticeIT_Cap4_ConditionalExecution;

public class DaysInMonth {

    public static void main(String[] args) {

        System.out.println(daysInMonth(1));
        System.out.println(daysInMonth(3));
        System.out.println(daysInMonth(5));
        System.out.println(daysInMonth(6));
        System.out.println(daysInMonth(9));
        System.out.println(daysInMonth(11));

    }

    public static int daysInMonth(int month){

        int days = 0 ;

        switch (month){

            case 1 :
                days = 31 ;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31 ;
                break;
            case 4:
                days = 30 ;
                break;
            case 5:
                days = 31 ;
                break;
            case 6 :
                days = 30 ;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9 :
                days = 30 ;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30 ;
                break;
            case 12:
                days = 31;
                break;
                default:
                    System.out.println("Enter a month please !");
                    break;
        }

        return days;
    }
}
